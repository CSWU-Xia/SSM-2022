package com.xiaxin.spring.service.impl;

import com.xiaxin.spring.bean.Dept;
import com.xiaxin.spring.dao.DeptDao;
import com.xiaxin.spring.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deptService")
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    @Override
    public void save(Dept dept) {
        deptDao.insert(dept);
    }
}
