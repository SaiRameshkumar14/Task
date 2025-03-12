// 1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.

public class BookDTO {

    private String title;
    private String ISBN;
    private String author;
    private double price;

    public static int totalBook = 0;

    @Override
    public String toString() {
        return "BookDTO{"
                + "title='" + title + '\''
                + ", ISBN='" + ISBN + '\''
                + ", author='" + author + '\''
                + ", price=" + price
                + '}';
    }

    //constructor
    public BookDTO(String title, String ISBN, String author, double price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        totalBook++;

    }

    // Getters and Setters for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getters and setters for ISBN
    public String getISBN() {
        return ISBN;
    }

    public void setters(String ISBN) {
        this.ISBN = ISBN;
    }

    // Getters and setters for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getters and setters for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
