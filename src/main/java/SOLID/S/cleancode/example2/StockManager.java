package SOLID.S.cleancode.example2;

public class StockManager {

    public boolean checkStock(Item item) {
        System.out.println("Check stock for " + item.getName() + "...");
        return true;
    }
}