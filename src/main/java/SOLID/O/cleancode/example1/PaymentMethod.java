package SOLID.O.cleancode.example1;

public interface PaymentMethod {
    void processPayment(double amount, DiscountStrategy discountStrategy);
}