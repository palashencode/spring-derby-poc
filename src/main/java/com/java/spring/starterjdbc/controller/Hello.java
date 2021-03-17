package com.java.spring.starterjdbc.controller;

import java.util.List;

import com.java.spring.starterjdbc.mapper.EmployeeMapper;
import com.java.spring.starterjdbc.model.Employee;
import com.java.spring.starterjdbc.service.DerbyClient;
import com.java.spring.starterjdbc.service.SampleClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Hello {

  @Autowired
  DerbyClient derbyClient;

  @Autowired
  @Qualifier("b")
  SampleClient sampleClient;

  @GetMapping("/sampleclient")
  public String getSampleClient() {
    return sampleClient.getValue();
  }

    @GetMapping("/status")
    public String getAllUsers() {
      return "all ok, spring started derby app is up and running.";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
      List<Employee> empList =  derbyClient.getAllEmployees();
      return empList;
    }
}
