package SOLID.O.paymentmanager.cleancode;

public interface PaymentMethod {
    void processPayment(double amount, DiscountStrategy discountStrategy);
}