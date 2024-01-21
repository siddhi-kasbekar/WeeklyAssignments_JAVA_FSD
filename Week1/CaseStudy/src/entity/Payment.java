package entity;

import java.time.LocalDateTime;

public class Payment {
    private Long paymentID;
    private Long orderID;
    private Long userID;
    private LocalDateTime paymentDate;
    private Double amount;
    private String paymentMethod;
    private String transactionID;
    
    //parameterized constructor
	public Payment(Long paymentID, Long orderID, Long userID, LocalDateTime paymentDate, Double amount,
			String paymentMethod, String transactionID) {
		super();
		this.paymentID = paymentID;
		this.orderID = orderID;
		this.userID = userID;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionID = transactionID;
	}
	
	//getters and setters
	public Long getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(Long paymentID) {
		this.paymentID = paymentID;
	}
	
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
	
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	
	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", orderID=" + orderID + ", userID=" + userID + ", paymentDate="
				+ paymentDate + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", transactionID="
				+ transactionID + "]";
	}

    
    
}

