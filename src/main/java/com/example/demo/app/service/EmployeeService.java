package com.example.demo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.dao.EmployeeDAO;
import com.example.demo.app.entities.Employee;

@Service
public class EmployeeService 
{
	
	@Autowired
	private EmployeeDAO edao;

	public Employee createEmployee(Employee e)
	{
		return edao.save(e);
	}

	public Employee getEmployeeByID(Integer employeeID) {
		// TODO Auto-generated method stub
		Employee employee=edao.findById(employeeID).get();
		return employee;
	}
	
	public Iterable<Employee> getAllEmployees()
	{
		Iterable<Employee> employee=edao.findAll();
		return employee;
	}
	
	
	public Employee updateEmployeeCity(Integer eid,String newCity)
	{
		Employee employee=edao.findById(eid).get();
		employee.setEcity(newCity);
		edao.save(employee);
		return employee;
	}
	
}
