package com.meddew.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.meddew.entity.Employee;
import com.meddew.repository.EmployeeRepository;
import com.meddew.repository.EmployeeRpositoryImpl;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {EmployeeRpositoryImpl.class , EmployeeServiceImpl.class})
@ContextConfiguration(classes = {EmployeeServiceImpl.class})
public class EmployeeServiceImplTest {
	
	//@Autowired
	//private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeService employeeService;
	
//	@Before
//	public void init() {
//		employeeRepository.
//	}
	
	@Test
	public void isDINotInjectedTest() {
		assertNull(employeeService);
//		List<Employee> repoEmployeeList = employeeRepository.getEmployees();
//		List<Employee> serviceEmployeeList = employeeService.getListEmployees();
//		
//		assertNotNull(repoEmployeeList);
//		assertNotNull(serviceEmployeeList);
//		
//		assertEquals(repoEmployeeList.size(), serviceEmployeeList.size());
//		
//		Employee [] employeeRepoArr = new Employee[repoEmployeeList.size()];
//		employeeRepoArr = repoEmployeeList.toArray(employeeRepoArr);
//		Employee [] employeeServiceArr = new Employee[serviceEmployeeList.size()];
//		employeeServiceArr = serviceEmployeeList.toArray(employeeServiceArr);
//		
//		assertArrayEquals(employeeRepoArr, employeeServiceArr);
	}
	
	@Test
	public void isDIInjectedTest() {
		assertNotNull(employeeService);
	}
}
