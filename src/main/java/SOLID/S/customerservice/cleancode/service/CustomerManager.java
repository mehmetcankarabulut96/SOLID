package SOLID.S.customerservice.cleancode.service;

import SOLID.S.customerservice.badcode.ATMLogger;
import SOLID.S.customerservice.cleancode.dao.CustomerDAOI;
import SOLID.S.customerservice.cleancode.domain.Account;
import SOLID.S.customerservice.cleancode.domain.Customer;
import SOLID.S.customerservice.cleancode.ex.*;
import SOLID.S.customerservice.cleancode.util.Validator;

import java.util.logging.Logger;

public class CustomerManager implements CustomerService{
	private CustomerDAOI customerDao;

	// Logged in customer
	private Customer currentCustomer;

	private Validator passwordValidator;

	protected Logger logger;

	public CustomerManager() {
		logger = ATMLogger.getLogger();
	}

	@Override
	public void createCustomer(Customer customer) throws CustomerAlreadyExistsException{
		customerDao.createCustomer(customer);
	}
	
	/**
	 * Retrieved the customer for given tckn from the db.
	 * @return Customer retreieved
	 * @throws NoSuchCustomerException Throws when no such customer for given tckn found
	 */
	@Override
	public Customer retrieveCustomer(String tckn) throws NoSuchCustomerException {
        return customerDao.retrieveCustomer(tckn);
	}

	@Override
	public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException {
		return customerDao.refreshCustomer(customer);
	}

	@Override
	public boolean lockCustomer(Customer customer) {
		boolean lock = false;
		customer.setLocked(true);
		try {
			lock = customerDao.updateCustomer(customer);
			logger.info("Customer locked: " + customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when locking the customer " + e.getMessage());
		}
		return lock;
	}

	@Override
	public Account getDefaultAccount(Customer customer) {
		return customer.getDefaultAccount();
	}

	@Override
	public boolean changePassword(Customer customer, String password) throws NoProperPasswordException, ImproperCustomerCredentialsException {
		boolean change = false;
		passwordValidator.validate(password);
		customer.setPassword(password);
		
		try {
			change = customerDao.updateCustomer(customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when updating the password of the customer " + e.getMessage());
		}
		logger.info("Customer changed the password: " + customer);
		return change;
	}
	
	/**
	 * Retrieved current logged-in customer.
	 * @return Current logged-in customer
	 */
	@Override
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	@Override
	public void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException{
		if (customer.isLoggedIn()) {
			throw new CustomerAlreadyLoggedException("Customer is already logged in. Please first log out.");
		}
	}

	@Override
	public void checkIfCustomerLocked(Customer customer) throws CustomerLockedException {
		if (customer.isLocked()) {
			throw new CustomerLockedException("Customer is locked. Please consult your admin.");
		}
	}
}