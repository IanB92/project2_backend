package transferobjects;

public class ResolvedPojo {
	private int reimbursementId;
	private int employeeId;
	private Float reimbursementAmount;
	private String reimbursementReason;
	private String reimbursementDate;
	private String status;
	
	public ResolvedPojo(int reimbursementId, int employeeId, Float reimbursementAmount, String reimbursementReason,
			String reimbursementDate, String status) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.reimbursementAmount = reimbursementAmount;
		this.reimbursementReason = reimbursementReason;
		this.reimbursementDate = reimbursementDate;
		this.status = status;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Float getReimbursementAmount() {
		return reimbursementAmount;
	}

	public void setReimbursementAmount(Float reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}

	public String getReimbursementReason() {
		return reimbursementReason;
	}

	public void setReimbursementReason(String reimbursementReason) {
		this.reimbursementReason = reimbursementReason;
	}

	public String getReimbursementDate() {
		return reimbursementDate;
	}

	public void setReimbursementDate(String reimbursementDate) {
		this.reimbursementDate = reimbursementDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResolvedPojo [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId
				+ ", reimbursementAmount=" + reimbursementAmount + ", reimbursementReason=" + reimbursementReason
				+ ", reimbursementDate=" + reimbursementDate + ", status=" + status + "]";
	}

	

	
	
	
}
