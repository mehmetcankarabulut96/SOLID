package SOLID.S.badcode.example2;

import java.util.List;

public class OrderProcessor {

    public double calculateTotalSum(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total * 1.20;
    }

    public boolean checkStock(Item item) {
        System.out.println(item.getName() + " için stok kontrol ediliyor...");
        return true;
    }

    public void sendEmailConfirmation(String customerEmail) {
        System.out.println("E-posta gönderiliyor: " + customerEmail);
    }

    public void saveToDatabase() {
        System.out.println("Sipariş veritabanına kaydedildi.");
    }
}