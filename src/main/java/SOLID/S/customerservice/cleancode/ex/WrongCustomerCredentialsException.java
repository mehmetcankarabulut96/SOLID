package SOLID.S.customerservice.cleancode.ex;

public class WrongCustomerCredentialsException extends Exception {
	public WrongCustomerCredentialsException(String message){
		super(message);
	}
}
