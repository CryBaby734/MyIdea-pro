package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderProcessor {

    private List<Order> orders;

    public OrderProcessor(){
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Customer customer, List<Book> books) {
        int orderId = generateOrderId();
        Order order = new Order(orderId, customer);


        for (Book book : books) {

            int quantity = new Random().nextInt(10) + 1;
            InventoryItem item = new InventoryItem(book, quantity, book.getPrice());
            order.addItem(item);
        }

        orders.add(order);
        order.processOrder();
    }


    public int generateOrderId(){
        Random random = new Random();
        return random.nextInt(1000000);
    }

    public void displayOrders() {
        System.out.println("Orders:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Total: $" + order.calculateTotal());
            System.out.println("Processed: " + order.isProcessed());
            System.out.println("Books:");
            for (InventoryItem item : order.getItems()) {
                System.out.println(item.getBook().getBookname() + " by " + item.getBook().getAuthor());
            }
            System.out.println("----------------------");
        }
    }






}
