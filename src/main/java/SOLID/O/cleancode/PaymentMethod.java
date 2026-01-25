package SOLID.O.cleancode;

public interface PaymentMethod {
    void processPayment(double amount, DiscountStrategy discountStrategy);
}