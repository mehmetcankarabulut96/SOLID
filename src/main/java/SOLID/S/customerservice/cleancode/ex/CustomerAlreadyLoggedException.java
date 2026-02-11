package SOLID.S.customerservice.cleancode.ex;

public class CustomerAlreadyLoggedException extends Exception {
	
	public CustomerAlreadyLoggedException(String message) {
		super(message);
	}
}
