package Project1;

public class Customer {
     private int id;
     private String name;
     private String contactInfo;

     public Customer(int id, String name, String contactInfo) {
          this.name = name;
          this.id = id ;
          this.contactInfo = contactInfo;
     }

     public String getName() {
          return name;
     }

     public String toString () {
               return "Client{" +
                       "name='" + name + '\'' +
                       ", contactInfo='" + contactInfo + '\'' +

                       '}';
          }
     }
