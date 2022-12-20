package com.xiaxin.beforeaop;

import java.util.Arrays;

public class MyLogging {

    public static void beforeMethod(String methodName, Object[] args) {
        System.out.println("===>Calc中的" + methodName + "()方法，参数:" + Arrays.toString(args));
    }

    public static void afterMethod(String methodName, Object rs) {
        System.out.println("===>Calc中的" + methodName + "()方法结果为" + rs);
    }
}
