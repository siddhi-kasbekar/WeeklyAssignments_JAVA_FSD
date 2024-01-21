package entity;

import java.time.LocalDate;

public class Discount {
    private Long discountID;
    private Long restaurantID;
    private Double discountPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    
    
    //parameterized constructor
	public Discount(Long discountID, Long restaurantID, Double discountPercentage, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.discountID = discountID;
		this.restaurantID = restaurantID;
		this.discountPercentage = discountPercentage;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	//getters and setters
	public Long getDiscountID() {
		return discountID;
	}
	public void setDiscountID(Long discountID) {
		this.discountID = discountID;
	}
	
	public Long getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Long restaurantID) {
		this.restaurantID = restaurantID;
	}
	
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	@Override
	public String toString() {
		return "Discount [discountID=" + discountID + ", restaurantID=" + restaurantID + ", discountPercentage="
				+ discountPercentage + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
    
    


}
