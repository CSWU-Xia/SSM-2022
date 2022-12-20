package com.xiaxin.spring.bean;

public class Student {
    private Integer stuId;
    private String stuName;

    public Student() {
    }

    public Student(Integer stuId, String stuName) {
        System.out.println("有参构造");
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        System.out.println("=============>setStuId");
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
