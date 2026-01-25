package SOLID.O.cleancode;

public class CardDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - amount * 0.3;
    }
}