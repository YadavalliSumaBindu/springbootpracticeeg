package com.web5.repo;

import org.springframework.data.repository.CrudRepository;

import com.web5.model.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
