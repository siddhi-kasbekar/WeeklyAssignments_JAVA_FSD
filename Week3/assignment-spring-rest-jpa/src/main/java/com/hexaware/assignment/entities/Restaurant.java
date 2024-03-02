package com.hexaware.assignment.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Pattern;



@Entity
@Table(name="restaurant_master")
public class Restaurant {
	
	@Id
	private long resId;
	
	@Pattern(regexp = "^[a-zA-Z]+$")
	private String resName;
	
	@Pattern(regexp = "^[a-zA-Z]+$")
	private String location;
	
	@Pattern(regexp = "[0-9]{10}")
	private String contactNo;
	
	@DecimalMin(value = "0", inclusive = true)
    @DecimalMax(value = "5", inclusive = true)
	private BigDecimal rating;
	
	
	public Restaurant() {
		super();
	}
	
	
	public Restaurant(long resId, String resName, String location, String contactNo, BigDecimal rating) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.location = location;
		this.contactNo = contactNo;
		this.rating = rating;
	}
	
	
	public long getResId() {
		return resId;
	}
	public void setResId(long resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public BigDecimal getRating() {
		return rating;
	}
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		return "Restaurant [resId=" + resId + ", resName=" + resName + ", location=" + location + ", contactNo="
				+ contactNo + ", rating=" + rating + "]";
	}
	
	
	

}
