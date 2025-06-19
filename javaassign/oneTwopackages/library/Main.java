
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        Member member = new Member("Alice");
        Transaction transaction = new Transaction(book, member);
        transaction.issueBook();
    }
}
