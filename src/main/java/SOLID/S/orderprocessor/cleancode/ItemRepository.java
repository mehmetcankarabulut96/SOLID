package SOLID.S.orderprocessor.cleancode;

public class ItemRepository {

    public void saveToDatabase(Item item) {
        System.out.println(item.getName() + " saved to db.");
    }

    public void saveToFile(Item item) {
        System.out.println(item.getName() + " saved to file.");
    }
}