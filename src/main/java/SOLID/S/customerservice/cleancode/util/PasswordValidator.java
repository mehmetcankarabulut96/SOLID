package SOLID.S.customerservice.cleancode.util;

import SOLID.S.customerservice.cleancode.ex.NoProperPasswordException;

public class PasswordValidator implements Validator{

    public boolean validate(String password) throws NoProperPasswordException {
        boolean b1 = false;
        boolean b2 = false;
        int length = password.length();
        // Length check
        if (length < 6)
            throw new NoProperPasswordException("The password you provided doesn't satisfies the rules: " + password);

        // Letter check
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isLetter(c)) {
                b1 = true;
                break;
            }
        }

        // Digit check
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                b2 = true;
                break;
            }
        }

        // If both hold true
        if (b1 & b2)
            return true;
        else
            throw new NoProperPasswordException("The password you provided doesn't satisfies the rules: " + password);
    }
}