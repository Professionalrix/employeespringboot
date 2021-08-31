package com.springboot.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.enities.Employee;
import com.springboot.project.repositories.EmployeeRepository;
import com.springboot.project.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployeeList() {

		return employeeRepository.findAll();
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
