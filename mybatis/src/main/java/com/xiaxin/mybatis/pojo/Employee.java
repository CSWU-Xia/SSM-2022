package com.xiaxin.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 48407568272974691L;
    private Integer id;
    private String lastName;
    private String email;
    private Double salary;

}
