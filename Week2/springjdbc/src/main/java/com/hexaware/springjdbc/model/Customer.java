package com.hexaware.springjdbc.model;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int age;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, int age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + "]";
	}
	
	

}
