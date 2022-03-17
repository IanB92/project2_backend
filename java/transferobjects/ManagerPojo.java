package transferobjects;

public class ManagerPojo {
	
	private int managerId;
	private String firstName;
	private String lastName;
	private String address;
	private String contact;
	private String email;
	private String userName;
	private String password;
	private String role;
	
	
	public ManagerPojo(){
		super();
		
	}


	public ManagerPojo(int managerId, String firstName, String lastName, String address, String contact, String email,
			String userName, String password, String role) {
		super();
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "ManagerPojo [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", contact=" + contact + ", email=" + email + ", userName=" + userName
				+ ", password=" + password + ", role=" + role + "]";
	}

	
	
}
