package com.xiaxin.beforeaop.proxy;


import com.xiaxin.beforeaop.MyLogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {
    /**
     * @param 代理的目标对象
     * @author xiaxin
     * @date 2022/12/20 16:03
     */
    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }

    /**
     * @param
     * @description: 获取目标对象的代理对象
     * @author xiaxin
     * @date 2022/12/20 16:15
     */
    public Object getProxyObject() {
        Object proxy = null;
        /**
         * 目标对象的类加载器
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        /**
         * 目标对象实现接口
         */
        Class<?>[] interfaces = target.getClass().getInterfaces();
        proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //执行目标方法之前添加日志
                MyLogging.beforeMethod(method.getName(), args);
                //触发目标对象目标方法方法
                Object obj = method.invoke(target, args);
                //执行目标方法之后添加日志
                MyLogging.afterMethod(method.getName(), obj);
                return obj;
            }
        });
        return proxy;
    }
}
