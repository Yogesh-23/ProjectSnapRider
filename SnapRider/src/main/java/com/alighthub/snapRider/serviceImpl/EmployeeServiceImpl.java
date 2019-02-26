package com.alighthub.snapRider.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.snapRider.dao.EmployeeDao;
import com.alighthub.snapRider.model.Employee;
import com.alighthub.snapRider.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeedao;
	
	
	@Override
	public Employee addEmployee(Employee employee) {

		return employeedao.save(employee);
	}

	@Override
	public Employee editEmployee(int id) {
		
		return employeedao.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		
		return employeedao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
	
		employeedao.deleteById(id);
		
	}
}
