package com.spring.xmlconfig.dao;

import java.util.List;

import com.spring.xmlconfig.Employee;

public interface EmployeeDAO {

	public void insert(Employee employee);
	public void update(Employee employee);
	public List<Employee> findAll();
	public void delete(Employee e);
}
