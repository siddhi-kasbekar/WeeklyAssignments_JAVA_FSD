package com.hexaware.casestudy.model;
import java.math.BigDecimal;


public class Restaurant {
	
	private int resId;
	private String resName;
	private String location;
	private String contactNo;
	private BigDecimal rating;
	
	
	public Restaurant() {
		super();
	}
	
	
	public Restaurant(int resId, String resName, String location, String contactNo, BigDecimal rating) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.location = location;
		this.contactNo = contactNo;
		this.rating = rating;
	}
	
	
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
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
