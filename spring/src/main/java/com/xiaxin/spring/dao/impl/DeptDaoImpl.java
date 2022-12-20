package com.xiaxin.spring.dao.impe;

import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.dao.DeptDao;

public class DeptImpl implements DeptDao {
    @Override
    public void insert(Dept dept) {
        System.out.println("Dept添加成功");
    }
}
