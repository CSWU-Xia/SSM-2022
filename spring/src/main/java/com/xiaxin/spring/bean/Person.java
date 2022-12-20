package com.xiaxin.spring.bean;

public class Person {
    private Integer id;
    private String name;

    public Person() {
        System.out.println("构造方法");
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        System.out.println("设置id属性值");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void initPerson() {
        System.out.println("初始化方法");
    }

    public void destoryPerson() {
        System.out.println("销毁方法");
    }
}
