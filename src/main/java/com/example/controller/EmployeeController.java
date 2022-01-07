package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/vi/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//全従業員の検索
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
}
