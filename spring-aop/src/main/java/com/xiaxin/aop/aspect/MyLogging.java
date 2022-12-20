package com.xiaxin.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;


//将当前组件标识为一个组件
//@Component
//将当前类标识为切面类
//@Aspect
public class MyLogging {

    @Before(value = "")
    public void beforeAdvance() {
        // TODO document why this method is empty
    }

    @Around("")
    public void aroundAdvance() {
        // TODO document why this method is empty
    }

    @After("")
    public void afterAdvance() {
        // TODO document why this method is empty
    }
}
