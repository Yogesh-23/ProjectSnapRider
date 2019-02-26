package com.alighthub.snapRider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Customer;
import com.alighthub.snapRider.model.Login;
import com.alighthub.snapRider.service.CustomerService;
import com.alighthub.snapRider.service.LoginService;

@RestController
@RequestMapping("/customer")
public class CustomerController {


	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerService.addCustomer(customer);
	}

	@GetMapping("/{id}")
	public Customer editCustomer(@PathVariable int id) {
		
		return customerService.editCustomer(id);
	}

	@PutMapping("/")
	public Customer updateCustomer(@RequestBody Customer customer) {
	
		return customerService.updateCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public int deleteCustomer(@PathVariable int id) {
		
		 String msg="successful deleted";
		   int no=  customerService.deleteCustomer(id);
		     return no;
	}

	@GetMapping("/display")
	public List<Customer> getallCustomer()
	{
		List<Customer> list=customerService.diplayAllCustomer();
		return list;
	}
	
}
