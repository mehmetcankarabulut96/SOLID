package SOLID.O.cleancode;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount, DiscountStrategy discountStrategy) {
        double finalAmount = discountStrategy.applyDiscount(amount);
        System.out.println(finalAmount + " paid with credit card");
    }
}