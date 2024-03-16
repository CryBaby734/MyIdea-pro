package Project1;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem  {

    private List<Book> books;

    public InventoryItem() {
        this.books=new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int ISBN) {
        books.removeIf(book -> book.getIsbn() == ISBN);
    }
        public void displayBook() {
            System.out.println("Current Inventory: ");
            for (Book book : books) {
                System.out.println(book.getIdBook() + "Id: " + book.getBookname() + " by " + book.getAuthor() + " ISB: " + book.getIsbn() + " price: " + book.getPrice());
            }

    }
}