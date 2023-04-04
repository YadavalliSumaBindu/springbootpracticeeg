package com.web5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web5.model.Employee;
import com.web5.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public Employee saveEmployee(Employee emp)
	{
		return repo.save(emp);
	}
	@Override
	public Employee getEmployee(Integer e_Id)
	{
		Employee e2=repo.findById(e_Id).get();
		return e2;
	}
	@Override
	public List<Employee> getAllEmployee()
	{
		List<Employee> emps=(List<Employee>) repo.findAll();
		return emps;
	}
	@Override
	public Employee updateEmployee(Employee emp,Integer e_Id)
	{
		Optional <Employee> opt=repo.findById(e_Id);
		Employee emp1=opt.get();
		emp1.setE_Name(emp.getE_Name());
		emp1.setE_Email(emp.getE_Email());
		emp1.setE_Address(emp.getE_Address());
		return repo.save(emp1);
	}
	@Override
	public void deleteEmployee(Integer e_Id)
	{
		repo.deleteById(e_Id);
	}
} 
