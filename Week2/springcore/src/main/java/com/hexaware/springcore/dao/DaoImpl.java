package com.hexaware.springcore.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{

	@Override
	public void getDao() {

		System.out.println("Dao method executed...");
	}

}
