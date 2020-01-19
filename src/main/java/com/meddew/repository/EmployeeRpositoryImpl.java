package com.meddew.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.meddew.entity.Employee;

@Repository
@Configuration
public class EmployeeRpositoryImpl implements EmployeeRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	private static final String GET_EMPLOYEES = "Select e from employee e";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Query query = em.createQuery(GET_EMPLOYEES);
		
		return query.getResultList();
	}

}
