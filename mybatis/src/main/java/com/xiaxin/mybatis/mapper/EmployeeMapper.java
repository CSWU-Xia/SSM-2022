package com.xiaxin.mybatis.mapper;

import com.xiaxin.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    /**
     * 通过id获取员工信息
     */
    Employee selectEmpById(int id);

    /**
     * @description: 添加员工
     * @author xiaxin
     * @date 2022/12/17 16:12
     */
    void insertEmployee(Employee employee);

    /**
     * @description: 修改员工信息
     * @author xiaxin
     * @date 2022/12/17 16:12
     */
    void updateEmployee(Employee employee);

    /**
     * @description: 通过id删除员工信息
     * @author xiaxin
     * @date 2022/12/17 16:13
     */
    void deleteEmployee(int id);

    /**
     * @description: 查询所有员工信息
     * @author xiaxin
     * @date 2022/12/17 16:13
     */
    List<Employee> selectAllEmployees();

    Map<String, Object> selectMapById(int id);

    @MapKey("id")
    Map<Integer, Employee> selectMapEmployee();
}
