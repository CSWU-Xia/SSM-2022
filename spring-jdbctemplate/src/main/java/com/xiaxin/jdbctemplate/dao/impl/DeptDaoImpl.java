package com.xiaxin.jdbctemplate.dao.impl;

import com.xiaxin.jdbctemplate.bean.Dept;
import com.xiaxin.jdbctemplate.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dept> selectAll() {
        String sql = "select * from tbl_dept";
        RowMapper rowMapper = new BeanPropertyRowMapper(Dept.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}
