package com.hexaware.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc.model.Customer;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt("cid"));
		customer.setCustomerName(rs.getString("cname"));
		customer.setAge(rs.getInt("age"));
		return customer;
	}

}
