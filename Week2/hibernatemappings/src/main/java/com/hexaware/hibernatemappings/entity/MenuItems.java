package com.hexaware.hibernatemappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MenuItems {
	
	@Id
	private int menuId;
	private String menuName;
	private double price;
	
	@ManyToMany(mappedBy = "menuItems")
    private Set<Orders> orders = new HashSet<>();

	
	
	public MenuItems() {
		super();
	}
	public MenuItems(int menuId, String menuName, double price) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.price = price;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItems [menuId=" + menuId + ", menuName=" + menuName + ", price=" + price + "]";
	}
	
	
	

}
