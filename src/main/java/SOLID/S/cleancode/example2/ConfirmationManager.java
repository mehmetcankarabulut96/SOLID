package SOLID.S.cleancode.example2;

public class ConfirmationManager {

    public void sendEmailConfirmation(Customer customer) {
        System.out.println("Sending email to: " + customer.getEmail());
    }

    public void sendSMSConfirmation(Customer customer) {
        System.out.println("Sending SMS to: " + customer.getNumber());
    }
}