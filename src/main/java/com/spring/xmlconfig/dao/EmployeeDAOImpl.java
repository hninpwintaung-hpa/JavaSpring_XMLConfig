package com.spring.xmlconfig.dao;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.xmlconfig.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Employee employee) {
        String sql = "INSERT INTO employees (id, name, email, phone, address) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(), employee.getAddress());
    }
    public void update(Employee employee) {
    	String sql = "UPDATE employees set phone = ?, address = ? where id =? ";
    	jdbcTemplate.update(sql,employee.getPhone(), employee.getAddress(), employee.getId());
    }
    public List<Employee> findAll(){
    	String sql = "SELECT * from employees";
        List<Employee> employees = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
        return employees;
    	
    }
    public void delete(Employee employee) {
    	String sql = "delete from employees where id =?";
    	jdbcTemplate.update(sql,employee.getId());
    }
}
