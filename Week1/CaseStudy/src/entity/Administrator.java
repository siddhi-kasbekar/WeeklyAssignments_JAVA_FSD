package entity;


public class Administrator {
    private Long adminID;
    private String userName;
    private String password;
    private String name;
    private String email;
    
    
    //parameterized constructor
	public Administrator(Long adminID, String userName, String password, String name, String email) {
		super();
		this.adminID = adminID;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	
	//getters and setters
	public Long getAdminID() {
		return adminID;
	}
	public void setAdminID(Long adminID) {
		this.adminID = adminID;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Administrator [adminID=" + adminID + ", userName=" + userName + ", password=" + password + ", name="
				+ name + ", email=" + email + "]";
	}
    
    

}
