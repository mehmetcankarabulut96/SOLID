package SOLID.O.badcode;

// OCP tells us that a class or method or module should be open for extensions but closed for modifications
public class PaymentManager {
    public void pay(String type, double amount){
        if(type.equalsIgnoreCase("CREDIT_CARD")){
            System.out.println(amount + " paid with credit card");
        }
        else if(type.equalsIgnoreCase("PAYPAL")){
            System.out.println(amount + " paid with PayPal");
        }
        // we need to modify this class by adding new code here to support new payment methods ( violates the OCP )
    }
}