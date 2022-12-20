package com.xiaxin.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogging1 {
    /*
     * @description: 重用切入点表达式
     * @author xiaxin
     * @date 2022/12/20 18:22
     */

    @Pointcut("execution(public int com.xiaxin.aop.service.impl.CalcImpl.*(..))")
    public void pointCut() {
    }
    /*
     *//*
     * @param
     * @description: 前置通知
     * @author xiaxin
     * @date 2022/12/20 18:20
     *//*

    @Before(value = "pointCut()")
    public void beforeMethod(JoinPoint joinPoint) {
        //获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //获取参数
        Object[] args = joinPoint.getArgs();
        System.out.println("[前置通知]===>Calc中的" + methodName + "()方法，参数:" + Arrays.toString(args));
    }

    *//*
     * @param
     * @description: 后置通知
     * 执行方法之后执行，方法出现异常也会执行
     * @author xiaxin
     * @date 2022/12/20 18:20
     *//*
    @After(value = "pointCut()")
    public void afterMethod(JoinPoint joinPoint) {
        //获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //获取结果
        Object[] args = joinPoint.getArgs();
        System.out.println("[后置通知]===>Calc中的" + methodName + "()参数为" + Arrays.toString(args));
    }

    *//*
     * @param
     * @description: 返回通知
     * 返回结果时执行,出现异常时不执行
     * @AfterReturning中returning属性需要与入参参数名一致
     * @author xiaxin
     * @date 2022/12/20 18:33
     *//*
    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[返回通知]===>Calc中的" + methodName + "()结果为" + result);
    }

    *//*
     * @param
     * @description: 异常通知
     * 指定方法出现异常时执行，如无异常不执行
     * @author xiaxin
     * @date 2022/12/20 18:42
     *//*

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("[异常通知]===>");
        System.out.println("exception.getCause() = " + exception.getCause());
    }*/

    /**
     * @param joinPoint
     * @description: 整合前四个通知
     * @author xiaxin
     * @date 2022/12/20 18:51
     */
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result = null;
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        // TODO document why this method is empty
        try {
            System.out.println("[前置通知]=====>" + methodName);
            result = joinPoint.proceed();
            System.out.println("[返回通知]=====>" + result);
        } catch (Throwable e) {
            System.out.println("[异常通知]=====>" + e.getMessage());
        } finally {
            System.out.println("[后置通知]=====>" + methodName);
        }
        return result;
    }
}
