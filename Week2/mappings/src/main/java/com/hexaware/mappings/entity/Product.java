package com.hexaware.mappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_master")
public class Product {
	
	@Id
	private int prodId;
	private String prodName;
	
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
	private Set<Order>  orders = new HashSet<Order>();

	public Product() {
		super();
	}

	public Product(int prodId, String prodName, Set<Order> orders) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.orders = orders;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
	
	

}
