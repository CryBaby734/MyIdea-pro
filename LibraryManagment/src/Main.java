import Project1.Book;
import Project1.Customer;
import Project1.CustomerDatabase;
import Project1.InventoryItem;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Anvar Suyunov","+998993368029");
        Customer customer1 = new Customer(2,"Orifjon Suyunov","+998997042980");
        CustomerDatabase customerDatabase = new CustomerDatabase();
        customerDatabase.addCustomer(customer);
        customerDatabase.addCustomer(customer1);
      //  System.out.println(customerDatabase.findClient("Orifjon Suyunov"));
     //  customerDatabase.removeCustomer("Anvar Suyunov");

        customerDatabase.displayClients();

        Book book = new Book(1,"Lolita","Vladimir Nabokov",2100,70);
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addBook(book);
        inventoryItem.displayBook();



    }
}