package exceptions;

public class NothingPending extends Exception{
	public String getMessage() {
		return "No Pending Customers";
	}
}
