package com.namnd.springbootmybatisexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namnd.springbootmybatisexample.mapper.EmployeesMapper;
import com.namnd.springbootmybatisexample.model.Employees;
import com.namnd.springbootmybatisexample.model.EmployeesExample;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeesMapper employeesMapper;
	
	@GetMapping("/")
	public List<Employees> getAllEmployee() {
		EmployeesExample employeesExample = new EmployeesExample();
		employeesExample.createCriteria().andFirstNameEqualTo("Ha");
		List<Employees> employees = employeesMapper.selectByExample(employeesExample);
		return employees;
	}

}
