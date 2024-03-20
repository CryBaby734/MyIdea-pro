package Project1;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem  {
    private Book book;
    private  int quantity;
    private  int price;

    private List<Book> books;

    public InventoryItem(Book book, int quantity, int price) {
        this.book=book;
        this.quantity = quantity;
        this.price=price;
        this.books=new ArrayList<>();
    }



    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public List<Book> getBooks() {
        return books;
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