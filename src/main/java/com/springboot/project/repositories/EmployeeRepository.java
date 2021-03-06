package com.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.project.enities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
