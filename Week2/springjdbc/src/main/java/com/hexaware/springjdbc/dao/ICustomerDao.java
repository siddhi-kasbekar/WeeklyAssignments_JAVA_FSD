package com.hexaware.springjdbc.dao;

import java.util.List;

import com.hexaware.springjdbc.model.Customer;

public interface ICustomerDao {
	
public boolean insertCustomer(Customer customer);
	
	public boolean updateCustomer(Customer customer);
	
	public boolean deleteCustomerById(int cid);
	
	public Customer selectCustomerById(int cid);
	
	public List<Customer> selectAll();


}
