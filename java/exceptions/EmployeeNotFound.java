package exceptions;

public class EmployeeNotFound extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "No Employee Found...";
	}

	
}