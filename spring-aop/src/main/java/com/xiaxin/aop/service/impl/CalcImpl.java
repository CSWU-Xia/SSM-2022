package com.xiaxin.aop.service.impl;

import com.xiaxin.aop.service.Calc;
import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("===>Calc中的sub()方法，参数:" + a + "," + b);
        int result = a - b;
        System.out.println("===>Calc中的sub()方法结果为" + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("===>Calc中的mul()方法，参数:" + a + "," + b);
        int result = a * b;
        System.out.println("===>Calc中的mul()方法结果为" + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("===>Calc中的div()方法，参数+" + a + "," + b);
        int result = a / b;
        System.out.println("===>Calc中的div()方法结果为" + result);
        return result;
    }
}
