package SOLID.S.customerservice.cleancode.service;

import SOLID.S.customerservice.cleancode.domain.Customer;
import SOLID.S.customerservice.cleancode.ex.*;

public interface LoginService {
    public void login(String tckn, String password)
            throws NoSuchCustomerException, CustomerLockedException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
            MaxNumberOfFailedLoggingAttemptExceededException, ImproperCustomerCredentialsException, NoProperPasswordException;

    public boolean logout(Customer customer);
}