package entity;

public class Restaurant {
    private Long restaurantID;
    private String restaurantName;
    private String location;
    private String contactNumber;
    private Double rating;
    
    //parameterized constructor
	public Restaurant(Long restaurantID, String restaurantName, String location, String contactNumber, Double rating) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.location = location;
		this.contactNumber = contactNumber;
		this.rating = rating;
	}

	
	//getters and setters
	
	public Long getRestaurantID() {
		return restaurantID;
	}

	public void setRestaurantID(Long restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}


	
	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", restaurantName=" + restaurantName + ", location="
				+ location + ", contactNumber=" + contactNumber + ", rating=" + rating + "]";
	}
	
	
	
    
    

}
