package com.xiaxin.jdbctemplate.bean;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.id
     *
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.last_name
     *
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.email
     *
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.salary
     *
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    private Double salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.dept_id
     *
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.id
     *
     * @return the value of tbl_employee.id
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.id
     *
     * @param id the value for tbl_employee.id
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.last_name
     *
     * @return the value of tbl_employee.last_name
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.last_name
     *
     * @param lastName the value for tbl_employee.last_name
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.email
     *
     * @return the value of tbl_employee.email
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.email
     *
     * @param email the value for tbl_employee.email
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.salary
     *
     * @return the value of tbl_employee.salary
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.salary
     *
     * @param salary the value for tbl_employee.salary
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.dept_id
     *
     * @return the value of tbl_employee.dept_id
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.dept_id
     *
     * @param deptId the value for tbl_employee.dept_id
     * @mbg.generated Sun Dec 18 21:40:26 CST 2022
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                '}';
    }
}
