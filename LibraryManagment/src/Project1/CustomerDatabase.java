package Project1;

import java.util.ArrayList;
import java.util.List;

public  class CustomerDatabase  {
    private List<Customer> customers;

    public CustomerDatabase() {
        this.customers = new ArrayList<>();
    }


    public void addCustomer(Customer customer){
        customers.add(customer);
     }

     public void removeCustomer(String customer){
        customers.removeIf(customer1 -> customer1.getName().equals(customer));
     }

    public Customer findClient(String name) {
        return customers.stream()
                .filter(clients -> clients.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void displayClients(){
        System.out.println("Client Database: ");
            for(Customer customer: customers){
                System.out.println(customer);
            }
    }


}
