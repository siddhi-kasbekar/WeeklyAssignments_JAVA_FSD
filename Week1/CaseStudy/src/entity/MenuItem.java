package entity;



public class MenuItem {
    private Long menuID;
    private String itemName;
    private String description;
    private String category;
    private Double price;
    private String availabilityTime;
    private String specialDietaryInfo;
    private String tasteInfo;
    private String nutritionalInfo;
    private int cookingTime; 
    private Long restaurantID;
	
    
    //parameterized constructor
    public MenuItem(Long menuID, String itemName, String description, String category, Double price,
			String availabilityTime, String specialDietaryInfo, String tasteInfo, String nutritionalInfo,
			int cookingTime, Long restaurantID) {
		super();
		this.menuID = menuID;
		this.itemName = itemName;
		this.description = description;
		this.category = category;
		this.price = price;
		this.availabilityTime = availabilityTime;
		this.specialDietaryInfo = specialDietaryInfo;
		this.tasteInfo = tasteInfo;
		this.nutritionalInfo = nutritionalInfo;
		this.cookingTime = cookingTime;
		this.restaurantID = restaurantID;
	}


    //getters and setters
	public Long getMenuID() {
		return menuID;
	}


	public void setMenuID(Long menuID) {
		this.menuID = menuID;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getAvailabilityTime() {
		return availabilityTime;
	}


	public void setAvailabilityTime(String availabilityTime) {
		this.availabilityTime = availabilityTime;
	}


	public String getSpecialDietaryInfo() {
		return specialDietaryInfo;
	}


	public void setSpecialDietaryInfo(String specialDietaryInfo) {
		this.specialDietaryInfo = specialDietaryInfo;
	}


	public String getTasteInfo() {
		return tasteInfo;
	}


	public void setTasteInfo(String tasteInfo) {
		this.tasteInfo = tasteInfo;
	}


	public String getNutritionalInfo() {
		return nutritionalInfo;
	}


	public void setNutritionalInfo(String nutritionalInfo) {
		this.nutritionalInfo = nutritionalInfo;
	}


	public int getCookingTime() {
		return cookingTime;
	}


	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}


	public Long getRestaurantID() {
		return restaurantID;
	}


	public void setRestaurantID(Long restaurantID) {
		this.restaurantID = restaurantID;
	}


	@Override
	public String toString() {
		return "MenuItem [menuID=" + menuID + ", itemName=" + itemName + ", description=" + description + ", category="
				+ category + ", price=" + price + ", availabilityTime=" + availabilityTime + ", specialDietaryInfo="
				+ specialDietaryInfo + ", tasteInfo=" + tasteInfo + ", nutritionalInfo=" + nutritionalInfo
				+ ", cookingTime=" + cookingTime + ", restaurantID=" + restaurantID + "]";
	}
    
  
    
    


}


