package com.spring.xmlconfig.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xmlconfig.Employee;
import com.spring.xmlconfig.service.EmployeeService;

public class EmployeeController {

	private static ApplicationContext context;
	private EmployeeService employeeService;
	private Employee employee;
	
	 public void setEmployeeService(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }
	 
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeController employeeController = (EmployeeController) context.getBean("employeeController");
        
        //employeeController.insertEmployee();
		//employeeController.updateEmployee();
		//employeeController.getAllEmployee();
		employeeController.deleteEmployee();

	}
	public void insertEmployee() {
		employee = new Employee();
		employee.setId(3);
		employee.setName("Muyar");
		employee.setEmail("muyar@gmail.com");
		employee.setPhone("098765");
		employee.setAddress("Yangon");
		employeeService.insert(employee);
	}
	public void updateEmployee() {
		employee = new Employee();
		employee.setId(3);
		employee.setPhone("0832332");
		employee.setAddress("Mudon");
		employeeService.update(employee);
	}
	public void getAllEmployee(){
		List<Employee> employee= employeeService.findAll();
		for(Employee e : employee) {
			System.out.println("Employee name :" + e.getName()+ " ," + e.getEmail() + ", "+ e.getPhone() +", " +e.getAddress());		}
	}
	public void deleteEmployee() {
		employee = new Employee();
		employee.setId(3);
		employeeService.delete(employee);
	}
}
