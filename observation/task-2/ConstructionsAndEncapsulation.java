
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default constructor
    Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized constructor
    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getters
    int getBookId() {
        return bookId;
    }

    String getBookName() {
        return bookName;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    // Setters
    void setBookId(int bookId) {
        this.bookId = bookId;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class ConstructionsAndEncapsulation {
    public static void main(String[] args) {
         Book b1 = new Book();

        // Parameterized constructor
        Book b2 = new Book(101, "Java", "James Gosling", 500);

        System.out.println("Book 1:");
        b1.display();

        System.out.println("\nBook 2:");
        b2.display();

        // Setter
        b1.setBookId(102);
        b1.setBookName("C Programming");
        b1.setAuthor("Dennis Ritchie");
        b1.setPrice(400);

        System.out.println("\nAfter using Setter:");
        b1.display();

        // Getter
        System.out.println("\nBook Name: " + b1.getBookName());
    }
}