package SOLID.S.customerservice.cleancode.util;

import SOLID.S.customerservice.cleancode.ex.ImproperCustomerCredentialsException;

public class TcknValidator implements Validator{
    /**
     * This method validates tckn of the customer.
     *
     * @param tckn Tckn of the customer.
     * @throws ImproperCustomerCredentialsException Throws when the rules regarding the tckn are broken.
     */
    public boolean validate(String tckn) throws ImproperCustomerCredentialsException {
        boolean b = true;
        if (tckn == null | tckn.length() == 0)
            throw new ImproperCustomerCredentialsException("Empty TCKN not allowed.");

        String length = ATMProperties.getProperty("customer.tckn.length");
        int tcknLength = Integer.parseInt(length);
        if (tckn.length() < tcknLength)
            throw new ImproperCustomerCredentialsException("TCKN must have " + tcknLength + " characters.");
        return b;
    }
}