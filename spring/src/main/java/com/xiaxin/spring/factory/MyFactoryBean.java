package com.xiaxin.spring.factory;

import com.xiaxin.spring.bean.Dept;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Dept> {

    /**
     * 参数对象创建方法
     *
     * @return
     * @throws Exception
     */
    @Override
    public Dept getObject() throws Exception {
        Dept dept = new Dept(111, "研发部");
        return dept;
    }

    /**
     * 设置参数对象的类型
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Dept.class;
    }

    /**
     * 设施是否为单例
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
