package com.java.spring.starterjdbc.service;

import java.util.List;

import com.java.spring.starterjdbc.model.Employee;

public interface DerbyClient {
    public List<Employee> getAllEmployees();
}
