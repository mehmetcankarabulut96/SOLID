package SOLID.S.cleancode.example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        OrderFacade orderFacade = new OrderFacade();
        Customer me = new Customer("mehmetcan.karabulut96@gmail.com", "1234");
        List<Item> cartItems = new ArrayList<>();
        cartItems.add(new Item("iPhone", 120000));
        cartItems.add(new Item("Coffee Maker", 3500));
        cartItems.add(new Item("Tshirt", 250));

        orderFacade.completeOrder(me, cartItems);
    }
}