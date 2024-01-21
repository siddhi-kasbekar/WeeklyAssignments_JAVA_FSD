package entity;

public class User {
    private Long userID;
    private String userName;
    private String password;
    private String name;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;
    
    //parameterized constructor
	public User(Long userID, String userName, String password, String name, String gender, String contactNumber,
			String email, String address) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
	}
	
	//getters and setters 

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	
    
    

}
