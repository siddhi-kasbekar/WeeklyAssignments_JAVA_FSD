package com.hexaware.hibernatemappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private int custId;
	private String custName;
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "aid")
	private Address address;
	
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String phone, Address address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
