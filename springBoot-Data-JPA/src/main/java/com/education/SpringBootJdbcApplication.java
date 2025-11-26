package com.education;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.education.entity.Employee;
import com.education.service.EmployeeService;

@SpringBootApplication
public class SpringBootJdbcApplication {
	

	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		
		EmployeeService repo = context.getBean(EmployeeService.class);
		Employee employee = new Employee();
		employee.setName("hema");
		employee.setMarks(88);
		
		repo.save(employee);

		List<Employee> list = repo.getAllEmployees();
		
		for (Employee alien : list) {

			System.out.println(alien);
		}
	}

	
}
