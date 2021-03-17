package com.java.spring.starterjdbc.service.impl;

import java.util.List;

import com.java.spring.starterjdbc.mapper.EmployeeMapper;
import com.java.spring.starterjdbc.model.Employee;
import com.java.spring.starterjdbc.service.DerbyClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DerbyClientImpl implements DerbyClient{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Employee> getAllEmployees() {
        return jdbcTemplate.query("select * from Derby.emp",new EmployeeMapper());
    }
    
}
