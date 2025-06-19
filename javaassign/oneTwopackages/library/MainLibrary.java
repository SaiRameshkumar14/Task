package library;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainLibrary {

    public static void main(String[] args) {
        Book b = new Book("Harry Potter", "J.K. Rowling");
        Member m = new Member("Sai Ddiwaker", 101);
        Transaction t = new Transaction(b, m);

        b.display();
        m.display();
        t.issueBook();
    }
}
