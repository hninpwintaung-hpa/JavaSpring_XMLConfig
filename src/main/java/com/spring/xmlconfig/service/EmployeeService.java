package com.spring.xmlconfig.service;

import java.util.List;

import com.spring.xmlconfig.Employee;

public interface EmployeeService {

	public void insert(Employee employee);
	public void update(Employee employee);
	public List<Employee> findAll();
	public void delete(Employee e);
}
