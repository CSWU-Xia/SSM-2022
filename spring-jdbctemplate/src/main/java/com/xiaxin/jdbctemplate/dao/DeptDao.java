package com.xiaxin.jdbctemplate.dao;

import com.xiaxin.jdbctemplate.bean.Dept;

import java.util.List;

public interface DeptDao {
    /**
     * @param
     * @description: 查询全部部门信息
     * @author xiaxin
     * @date 2022/12/20 20:00
     */
    List<Dept> selectAll();
}
