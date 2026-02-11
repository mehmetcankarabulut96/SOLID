package SOLID.S.customerservice.badcode.ex;

/**
 * Thrown when a Customer object is saved if another Customer with the same tckn exists in the database.
 * @author akin
 *
 */
public class CustomerAlreadyExistsException extends Exception {
	public CustomerAlreadyExistsException(String message) {
		super(message);
	}
}
