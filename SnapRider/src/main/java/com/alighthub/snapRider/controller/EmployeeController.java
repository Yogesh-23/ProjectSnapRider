package com.alighthub.snapRider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Employee;
import com.alighthub.snapRider.service.EmployeeService;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public Employee EmployeeEditEmployee(@PathVariable ("id")int id) {
		
		return employeeService.editEmployee(id);
	}
	@PutMapping("/put")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);	
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		
		employeeService.deleteEmployee(id);
	}
}
