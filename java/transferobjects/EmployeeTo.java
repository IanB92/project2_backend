package transferobjects;

public class EmployeeTo {
	
	
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeAddress;
	private String employeePhoneNumber;
	
	private String employeeEmail;
	private String employeeUserName;
	private String employeePassword;

	
	public EmployeeTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTo(int employeeId, String employeeFirstName, String employeeLastName, 
			String employeeAddress, String employeePhoneNumber, String employeeEmail,
			String employeeUserName, String employeePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeAddress = employeeAddress;
		this.employeePhoneNumber = employeePhoneNumber;
		this.employeeEmail = employeeEmail;
		this.employeeUserName = employeeUserName;
		this.employeePassword = employeePassword;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeUserName() {
		return employeeUserName;
	}
	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	@Override
	public String toString() {
		return "EmployeeTo [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", employeeAddress=" + employeeAddress
				+ ", employeePhoneNumber=" + employeePhoneNumber + ", employeeEmail=" + employeeEmail
				+ ", employeeUserName=" + employeeUserName + ", employeePassword=" + employeePassword +"]";
	}

	
	
	
}
