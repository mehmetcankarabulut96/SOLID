package SOLID.S.customerservice.cleancode.util;

import SOLID.S.customerservice.cleancode.ex.*;

public interface Validator {
    boolean validate(String value) throws NoProperPasswordException, ImproperCustomerCredentialsException;
}