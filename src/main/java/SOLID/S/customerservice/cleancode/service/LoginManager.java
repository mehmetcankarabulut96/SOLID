package SOLID.S.customerservice.cleancode.service;


import SOLID.S.customerservice.cleancode.dao.CustomerDAOI;
import SOLID.S.customerservice.cleancode.domain.Customer;
import SOLID.S.customerservice.cleancode.ex.*;
import SOLID.S.customerservice.cleancode.util.ATMProperties;
import SOLID.S.customerservice.cleancode.util.Validator;

import java.util.logging.Logger;

public class LoginManager implements LoginService{
    private CustomerDAOI customerDao;
    private CustomerService customerService;
    private Validator tcknValidator;
    private Validator passwordValidator;
    private Logger logger;

    private int loginAttemptCount;

    @Override
    public void login(String tckn, String password)
            throws NoSuchCustomerException, CustomerLockedException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
            MaxNumberOfFailedLoggingAttemptExceededException, ImproperCustomerCredentialsException, NoProperPasswordException {

        // First validate parameters
        tcknValidator.validate(tckn);
        passwordValidator.validate(password);

        // Now retrieve the customer from the db
        Customer customer = customerDao.retrieveCustomer(tckn);

        customerService.checkIfCustomerAlreadyLoggedIn(customer);
        customerService.checkIfCustomerLocked(customer);
        checkCustomerPassword(customer, password);
        loginCustomer(customer);
    }

    @Override
    public boolean logout(Customer customer) {
        boolean logout = false;

        customer.setLoggedIn(false);
        try {
            logout = customerDao.updateCustomer(customer);
            logout = true;
            logger.info("Customer logging out: " + customer);
        } catch (NoSuchCustomerException e) {
            logger.severe("Problem when logging out the customer " + e.getMessage());
        }

        // It should point to null
        return logout;
    }

    private void checkCustomerPassword(Customer customer, String password)
            throws MaxNumberOfFailedLoggingAttemptExceededException, WrongCustomerCredentialsException, NoSuchCustomerException {
        if (!customer.getPassword().equals(password)) {
            loginAttemptCount++;
            if (loginAttemptCount == Integer.parseInt(ATMProperties.getProperty("customer.maxFailedLoginAttempt"))) {
                customer.setLocked(true);
                customerDao.updateCustomer(customer);
                loginAttemptCount = 0;
                throw new MaxNumberOfFailedLoggingAttemptExceededException("Max number of login attempt reached: " + loginAttemptCount);
            }
            else
                throw new WrongCustomerCredentialsException("TCKN/password is wrong.");
        }
    }

    private void loginCustomer(Customer customer) throws NoSuchCustomerException{
        customer.setLoggedIn(true);
        if (ATMProperties.getProperty("customer.logsin").equals("yes")) {
            customerDao.updateCustomer(customer);
        }
    }
}