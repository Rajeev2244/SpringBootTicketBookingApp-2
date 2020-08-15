package com.example.demo.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.app.entities.Employee;

public interface EmployeeDAO extends CrudRepository<Employee,Integer>{
}
