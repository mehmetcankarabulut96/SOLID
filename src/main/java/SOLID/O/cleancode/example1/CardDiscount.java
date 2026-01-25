package SOLID.O.cleancode.example1;

public class CardDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - amount * 0.3;
    }
}