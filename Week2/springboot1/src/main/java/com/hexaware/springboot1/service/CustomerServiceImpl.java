package com.hexaware.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot1.dao.ICustomerDao;

@Service
public class CustomerServiceImpl implements ICustomerService {

	
	@Autowired
	ICustomerDao dao;
	@Override
	public void getService() {
		dao.getDao();
		System.out.println("executing getService()");
		
	}

}
