package com.hexaware.hibernatemappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int addressId;
	private String city;
	private double pin;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL) //oppos site ref var 

	private Customer customers;
	
	public Address() {
		super();
	}
	public Address(int aid, String city, double pin) {
		super();
		this.addressId = aid;
		this.city = city;
		this.pin = pin;
	}
	public int getAid() {
		return addressId;
	}
	public void setAid(int aid) {
		this.addressId = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPin() {
		return pin;
	}
	public void setPin(double pin) {
		this.pin = pin;
	}
	public Customer getCustomers() {
		return customers;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
	
	

}
