import Project1.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Anvar Suyunov","+998993368029");
        Customer customer1 = new Customer(2,"Orifjon Suyunov","+998997042980");
        CustomerDatabase customerDatabase = new CustomerDatabase();
        customerDatabase.addCustomer(customer);
        customerDatabase.addCustomer(customer1);
      //  System.out.println(customerDatabase.findClient("Orifjon Suyunov"));
     //  customerDatabase.removeCustomer("Anvar Suyunov");

      //  customerDatabase.displayClients();

        Book book = new Book(1,"Lolita","Vladimir Nabokov",2100,70);
        Book book1 = new Book(2,"Rich dad and Poor dad","Robert Kiyosaki",2101,50);
        List<Book> books =new ArrayList<>();
        books.add(book);
        books.add(book1);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(customer,books);

        orderProcessor.displayOrders();







    }
}