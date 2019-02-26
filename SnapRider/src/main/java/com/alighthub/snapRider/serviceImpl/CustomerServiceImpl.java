package com.alighthub.snapRider.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alighthub.snapRider.dao.CustomerDao;
import com.alighthub.snapRider.model.Customer;
import com.alighthub.snapRider.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	
	@Autowired
	private CustomerDao customerdao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerdao.save(customer);
	}
	
	
	@Override
	public List<Customer> diplayAllCustomer() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}


	@Override
	public Customer editCustomer(int id)
		{
			return customerdao.findById(id).get();
	    }

	
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerdao.save(customer);
	}

	

	@Override
	public int deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerdao.deleteById(id);
		return id;
	}

	
	
	
}
