package Project1;

import java.util.ArrayList;
import java.util.List;

   public class Book {

       private int idBook;
       private String bookname;
       private String author;
       private int isbn;
       private int price;
       private List<Book> books;


       public Book(int idBook, String bookname, String author, int isbn, int price) {

           this.idBook = idBook;
           this.bookname = bookname;
           this.author = author;
           this.isbn = isbn;
           this.price = price;
           this.books = new ArrayList<>();



       }




       public int getIdBook() {
           return idBook;
       }

       public String getBookname() {
           return bookname;
       }

       public String getAuthor() {
           return author;
       }

       public int getIsbn() {
           return isbn;
       }

       public int getPrice() {
           return price;
       }




       }



