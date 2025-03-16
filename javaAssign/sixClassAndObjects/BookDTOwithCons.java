package java.sixClassAndObjects;

import java.util.ArrayList;
import java.util.List;

public class BookDTOwithCons {

    private List<BookDTO> books;

    public BookDTOwithCons() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String ISBN, String author, double price) {
        books.add(new BookDTO(title, ISBN, author, price));
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("Book List:");
        for (BookDTO book : books) {
            book.displayBookInfo();
        }
        System.out.println("Total books added: " + BookDTO.getTotalBooks());
    }

    public static void main(String[] args) {
        BookDTOwithCons library = new BookDTOwithCons();
        library.addBook("The Alchemist", "978-0061122415", "Paulo Coelho", 15.99);
        library.addBook("1984", "978-0451524935", "George Orwell", 9.99);
        library.addBook("To Kill a Mockingbird", "978-0060935467", "Harper Lee", 12.49);
        library.displayBooks();
    }
}
