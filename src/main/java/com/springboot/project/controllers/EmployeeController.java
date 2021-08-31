package com.springboot.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.project.enities.Employee;
import com.springboot.project.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/index")
	public String home()
	{
		
		return "index";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee) {
	
		employeeService.saveEmployee(employee);
		return "redirect:/index";
	}
}
