package com.java.spring.starterjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.spring.starterjdbc.model.Employee;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getString("ID"));
        emp.setName(rs.getString("NAME"));
        emp.setDeptId(rs.getString("DEPTID"));
        return emp;
    }

    
}
