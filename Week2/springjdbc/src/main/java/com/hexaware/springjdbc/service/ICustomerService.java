package com.hexaware.springjdbc.service;

import java.util.List;

import com.hexaware.springjdbc.model.Customer;

public interface ICustomerService {
	
	public boolean insertCustomer(Customer customer);
	
	public boolean updateCustomer(Customer customer);
	
	public boolean deleteCustomerById(int cid) ;
	
	public Customer selectCustomerById(int cid);
	
	public List<Customer> selectAll();

	

	

}
