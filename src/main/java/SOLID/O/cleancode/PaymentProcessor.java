package SOLID.O.cleancode;

public class PaymentProcessor {
    // strategy pattern
    public void execute(PaymentMethod paymentMethod, double amount, DiscountStrategy discountStrategy){
        paymentMethod.processPayment(amount, discountStrategy);
    }
}