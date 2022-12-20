package com.xiaxin.spring.bean;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Double salary;
    private Dept dept;
}
