package com.xiaxin.spring.dao.impl;

import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.dao.DeptDao;
import org.springframework.stereotype.Repository;

@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {
    @Override
    public void insert(Dept dept) {
        System.out.println("Dept添加成功");
    }
}
