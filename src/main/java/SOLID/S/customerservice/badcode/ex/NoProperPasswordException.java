package SOLID.S.customerservice.badcode.ex;

public class NoProperPasswordException extends ValidationException {
	public NoProperPasswordException(String message){
		super(message);
	}
}
