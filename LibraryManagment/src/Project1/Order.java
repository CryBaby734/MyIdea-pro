package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private int orderId;
    private Customer customer;
    private List<InventoryItem> items;
    private  boolean isProcessed;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items=new ArrayList<>();
        this.isProcessed= false;
    }



    public void addItem(InventoryItem item){
        items.add(item);
    }

    public int calculateTotal() {
        return items.stream().mapToInt(item -> item.getQuantity() * item.getPrice()).sum();
    }

    public void processOrder(){
        for(InventoryItem item : items){
            Book book = item.getBook();
            int quantityOrdered = item.getQuantity();

        }


        isProcessed = true;

    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public boolean isProcessed() {
        return isProcessed;
    }
}
