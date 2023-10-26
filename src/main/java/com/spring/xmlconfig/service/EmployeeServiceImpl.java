package com.spring.xmlconfig.service;

import java.util.List;

import com.spring.xmlconfig.Employee;
import com.spring.xmlconfig.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	public List<Employee> findAll() {
       return employeeDAO.findAll();
	}
	public void delete(Employee employee) {
		employeeDAO.delete(employee);
	}
}
