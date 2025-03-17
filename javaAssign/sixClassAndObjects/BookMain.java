package sixClassAndObjects;

public class BookMain {

    public static void main(String[] args) {
        BookDTO books = new BookDTO("Let's Make IT", "239iljfdw9348SD", "Sam Andrew", 340);
        books.displayBookInfo();
        System.out.println(BookDTO.getTotalBooks());
    }
}
