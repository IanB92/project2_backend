package exceptions;

public class SystemException extends Exception{
	


	@Override
	public String getMessage() {
		return "Something went wrong. Please try again!";
	}
}
