package SOLID.O.cleancode;

public class PayPalPayment implements PaymentMethod{

    @Override
    public void processPayment(double amount, DiscountStrategy discountStrategy) {
        double finalAmount = discountStrategy.applyDiscount(amount);
        System.out.println(finalAmount + " paid with PayPal");
    }
}