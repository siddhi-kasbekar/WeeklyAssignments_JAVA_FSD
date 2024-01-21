package entity;

import java.time.LocalDateTime;

public class Order {
    private Long orderID;
    private Long userID;
    private LocalDateTime orderDate;
    private Double totalCost;
    private String status;
    
    //parameterized constructor
	public Order(Long orderID, Long userID, LocalDateTime orderDate, Double totalCost, String status) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderDate = orderDate;
		this.totalCost = totalCost;
		this.status = status;
	}
	
	
	//getters and setters
	
	public Long getOrderID() {
		return orderID;
	}
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", userID=" + userID + ", orderDate=" + orderDate + ", totalCost="
				+ totalCost + ", status=" + status + "]";
	}
    
    

}
