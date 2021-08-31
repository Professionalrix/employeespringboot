package com.springboot.project.services;

import java.util.List;

import com.springboot.project.enities.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployeeList();
	public Employee saveEmployee(Employee employee);
	
}
