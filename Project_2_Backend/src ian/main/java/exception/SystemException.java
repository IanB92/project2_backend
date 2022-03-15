package exception;

public class SystemException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Application Failed! Please Try Again Later";
	}
}
