package SOLID.S.customerservice.cleancode.ex;

public class NegativeAmountException extends Exception {
	private static final String prefix = "Negative amount can't be provided. ";
	public NegativeAmountException(String string) {
		super(prefix + string);
	}
	
	public String getMessage(){
		return prefix + super.getMessage();
	}
}
