package com.alighthub.snapRider.service;

import com.alighthub.snapRider.model.Employee;

public interface EmployeeService {
	
	 public Employee addEmployee(Employee employee);
	 
	 public Employee editEmployee(int id);
	 
	 public Employee updateEmployee(Employee employee);
	 
	 public void deleteEmployee(int id);
	
}
