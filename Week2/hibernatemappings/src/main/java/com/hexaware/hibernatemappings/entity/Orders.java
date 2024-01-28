package com.hexaware.hibernatemappings.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Orders {
	
	@Id
	private int orderId;
	private LocalDate date;
	private String status;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
    private Set<MenuItems> menuItems = new HashSet<>();
	
	public Orders() {
		super();
	}
	public Orders(int orderId, LocalDate date, String status) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getDate() {
		return date;
	}
	public Set<MenuItems> getMenuItems() {
		return menuItems;
	}
	public void setMenuItems(Set<MenuItems> menuItems) {
		this.menuItems = menuItems;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addMenuItems(MenuItems m ) {
		this.getMenuItems().add(m);
		
	}
	
	
	

}
