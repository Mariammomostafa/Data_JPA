package com.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.Employee;
import com.education.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public void save(Employee employee) {
		
		employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> list = employeeRepo.findAll();
		return list;
	}

}
