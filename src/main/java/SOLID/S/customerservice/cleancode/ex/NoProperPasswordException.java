package SOLID.S.customerservice.cleancode.ex;

public class NoProperPasswordException extends ValidationException {
	public NoProperPasswordException(String message){
		super(message);
	}
}
