package SOLID.S.customerservice.cleancode.service;

import SOLID.S.customerservice.cleancode.domain.Account;
import SOLID.S.customerservice.cleancode.domain.Customer;
import SOLID.S.customerservice.cleancode.ex.*;

public interface CustomerService{
    void createCustomer(Customer customer) throws CustomerAlreadyExistsException;
    Customer retrieveCustomer(String tckn) throws NoSuchCustomerException;
    Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;
    boolean lockCustomer(Customer customer);
    Account getDefaultAccount(Customer customer);
    boolean changePassword(Customer customer, String password) throws NoProperPasswordException, ImproperCustomerCredentialsException;
    Customer getCurrentCustomer();
    void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException;
    void checkIfCustomerLocked(Customer customer) throws CustomerLockedException;
}