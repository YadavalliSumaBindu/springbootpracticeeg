package com.web5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web5.model.Employee;
import com.web5.service.EmployeeService;

import ch.qos.logback.core.model.Model;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	@PostMapping("/save")
	public String save(@RequestBody Employee emp,Model m)
	{
		Employee e1=service.saveEmployee(emp);
		String msg=null;
		if(e1!=null)
		{
			msg="data saved in database";
		}
		else
		{
			msg="data not saved";
		}
		return msg;
	}
	@GetMapping("get/{e_Id}")
	public Employee getOne(@PathVariable Integer e_Id)
	{
		Employee e3=service.getEmployee(e_Id);
		return e3;
	}
	@GetMapping("/getAll")
	public List<Employee> gettAll()
	{
		List<Employee> emps=service.getAllEmployee();
		return emps;
	}
	@PutMapping("/update/{e_Id}")
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable Integer e_Id)
	{
		Employee e4=service.updateEmployee(emp,e_Id);
		return e4;	
	}
	@DeleteMapping("/delete/{e_Id}")
	public void deleteOne(@PathVariable Integer e_Id)
	{
		service.deleteEmployee(e_Id);
	}
}
