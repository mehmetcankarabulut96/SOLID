package SOLID.S.cleancode.example2;

import java.util.List;

public class OrderManager {

    public double calculateTotalSum(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total * 1.20;
    }
}