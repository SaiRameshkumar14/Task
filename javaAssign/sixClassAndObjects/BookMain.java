package sixClassAndObjects;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    static List<BookDTO> books = new ArrayList<>();

    public static void addbook(String title, String ISBN, String author, double price) {
        BookDTO book = new BookDTO(title, ISBN, author, price);
        books.add(book);
    }

    public static void displayBooks() {
        for (BookDTO book : books) {
            book.displayBookInfo();
        }
    }

    public static void main(String[] args) {
        List<BookDTO> list = new ArrayList<>();
        addbook("Let's Make IT", "239iljfdw9348SD", "Sam Andrew", 340);
        addbook("", "239iljfdw9348SD", "Sam Andrew", 340);
        addbook("done", "239iljfdw9348SD", "Sam Andrew", 340);
        addbook("done", "239iljfdw9348SD", "Sam Andrew", 340);
        displayBooks();
        System.out.println(BookDTO.getTotalBooks());
    }
}
