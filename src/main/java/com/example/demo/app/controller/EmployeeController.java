package com.example.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.entities.Employee;
import com.example.demo.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(value = "/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	
	@GetMapping(value = "/allEmployees")
	public Iterable<Employee> getAllEmployees()
	{
		Iterable<Employee> employee=employeeService.getAllEmployees();
		return employee;
	}
	
	@GetMapping(value="/employee/{employeeID}")
	public Employee getEmployeeByID(@PathVariable("employeeID") Integer employeeID)
	{
		Employee employee=employeeService.getEmployeeByID(employeeID);
		return employee;
	}

	@PutMapping(value = "/updateEmployee/{eid}/{newCity}")
	public Employee updateEmployeeCity(@PathVariable("eid") Integer eid,@PathVariable("newCity") String newCity)
	{
		return employeeService.updateEmployeeCity(eid, newCity);
	}
	
}
