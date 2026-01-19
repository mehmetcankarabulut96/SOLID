package SOLID.S.cleancode.example2;

import java.util.List;

public class OrderFacade {
    private OrderManager orderManager = new OrderManager();
    private StockManager stockManager = new StockManager();
    private ConfirmationManager confirmationManager = new ConfirmationManager();
    private ItemRepository itemRepository = new ItemRepository();

    public void completeOrder(Customer customer, List<Item> items){
        // 1. Check stock
        for(Item item : items){
            if(!stockManager.checkStock(item)) return;
        }

        // 2. Calculate sum
        double totalSum = orderManager.calculateTotalSum(items);
        System.out.println("Total sum : " + totalSum);

        // 3. Save
        for(Item item : items){
            itemRepository.saveToDatabase(item);
        }

        // 4. Notification
        confirmationManager.sendEmailConfirmation(customer);
    }
}