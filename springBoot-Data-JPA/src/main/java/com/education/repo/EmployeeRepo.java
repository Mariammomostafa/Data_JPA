package com.education.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	


}
