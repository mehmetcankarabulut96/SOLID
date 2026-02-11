package SOLID.S.customerservice.cleancode.dao;

import SOLID.S.customerservice.cleancode.domain.Customer;
import SOLID.S.customerservice.cleancode.ex.*;

public interface CustomerDAOI {
    void createCustomer(Customer customer) throws CustomerAlreadyExistsException;
    Customer retrieveCustomer(String tckn) throws NoSuchCustomerException;
    Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;
    boolean updateCustomer(Customer customer) throws NoSuchCustomerException;
}