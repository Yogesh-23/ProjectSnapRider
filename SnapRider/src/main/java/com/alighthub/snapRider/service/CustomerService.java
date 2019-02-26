package com.alighthub.snapRider.service;

import java.util.List;

import com.alighthub.snapRider.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);

	public List<Customer> diplayAllCustomer();

	public Customer editCustomer(int id);
	
	public Customer updateCustomer(Customer customer);
	
	public int deleteCustomer(int id);

}
