package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Customer;


@Repository
public class CustomerDaoImpl  implements ICustomerDao{
	
	JdbcTemplate jdbcTemplate ;
	
	@Autowired
	public CustomerDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
		
		
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		String insertQuery = "insert into customers(cid,cname,age)  values(?,?,?)";
		int count = jdbcTemplate.update(insertQuery,customer.getCustomerId(),customer.getCustomerName(),customer.getAge());
		
		return count > 0;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		String updateQuery = "update customers set cname=?, age=? where cid=?";
		int count = jdbcTemplate.update(updateQuery,customer.getCustomerName(),customer.getAge(),customer.getCustomerId());

		return count >0;
	}

	@Override
	public boolean deleteCustomerById(int cid) {
		String deleteQuery = "delete from customers where cid=?";
		int count = jdbcTemplate.update(deleteQuery,cid);

		return count>0;
	}

	@Override
	public Customer selectCustomerById(int cid) {
		String selectById = "select * from customers where cid=?";
		Customer customer = jdbcTemplate.queryForObject(selectById, new CustomerMapper(), cid);
		
		return customer;
	}

	@Override
	public List<Customer> selectAll() {
		
		String selectAll = "select cid, cname, age from customers";
		List<Customer> list = jdbcTemplate.query(selectAll,new CustomerMapper());
		return list;
	}

}
