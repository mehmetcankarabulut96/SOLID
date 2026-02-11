package SOLID.S.customerservice.badcode.ex;

public class WrongCustomerCredentialsException extends Exception {
	public WrongCustomerCredentialsException(String message){
		super(message);
	}
}
