package com.hexaware.springboot1.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int custid;
	private String custName;
	private String email;
	public Customer() {
		super();
	}
	public Customer(int custid, String custName, String email) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.email = email;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", email=" + email + "]";
	}
	
	

}
