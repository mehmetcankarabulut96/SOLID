package SOLID.O.cleancode.example1;

public class PaymentProcessor {
    // strategy pattern
    public void execute(PaymentMethod paymentMethod, double amount, DiscountStrategy discountStrategy){
        paymentMethod.processPayment(amount, discountStrategy);
    }
}