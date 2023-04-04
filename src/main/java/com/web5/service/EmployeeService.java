package com.web5.service;

import java.util.List;

import com.web5.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	public Employee getEmployee(Integer e_Id);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee emp,Integer e_Id);
	public void deleteEmployee(Integer e_Id);
}
