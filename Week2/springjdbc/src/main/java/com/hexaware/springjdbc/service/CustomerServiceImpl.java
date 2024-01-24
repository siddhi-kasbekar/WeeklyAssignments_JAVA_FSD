package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.ICustomerDao;
import com.hexaware.springjdbc.model.Customer;


@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDao dao;

	@Override
	public boolean insertCustomer(Customer customer) {
		
		return dao.insertCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		return dao.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomerById(int cid) {
		return dao.deleteCustomerById(cid);
	}

	@Override
	public Customer selectCustomerById(int cid) {
		return dao.selectCustomerById(cid);
	}

	@Override
	public List<Customer> selectAll() {
		return dao.selectAll();
	}

}
