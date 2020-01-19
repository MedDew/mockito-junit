package com.meddew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.meddew.entity.Employee;

@Service
@Configuration
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public List<Employee> getListEmployees() {
		// TODO Auto-generated method stub
		return employeeService.getListEmployees();
	}

}
