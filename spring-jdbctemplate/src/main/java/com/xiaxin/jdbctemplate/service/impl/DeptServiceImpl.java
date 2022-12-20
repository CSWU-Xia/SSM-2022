package com.xiaxin.jdbctemplate.service.impl;

import com.xiaxin.jdbctemplate.bean.Dept;
import com.xiaxin.jdbctemplate.dao.DeptDao;
import com.xiaxin.jdbctemplate.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> getAllDept() {
        return deptDao.selectAll();
    }
}
