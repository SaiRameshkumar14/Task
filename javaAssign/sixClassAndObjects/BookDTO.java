package sixClassAndObjects;

public class BookDTO {

    private String title;
    private String ISBN;
    private String author;
    private double price;

    public static int totalBook = 0;

    // Constructor
    public BookDTO(String title, String ISBN, String author, double price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        totalBook++;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalBooks() {
        return totalBook;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Price: $" + price);
    }
}
