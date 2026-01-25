package SOLID.O.cleancode.example1;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}