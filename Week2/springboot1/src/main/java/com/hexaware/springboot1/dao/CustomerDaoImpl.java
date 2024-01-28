package com.hexaware.springboot1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public void getDao() {


		System.out.println("getting customer dao .....");
	}

	

}
