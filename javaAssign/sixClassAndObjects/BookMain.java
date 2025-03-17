package sixClassAndObjects;

public class BookMain {
    public static void main(String[] args) {
        List<BookDTO> list = new ArrayList<>();
        BookDTO books = new BookDTO("Let's Make IT", "239iljfdw9348SD", "Sam Andrew", 340);
        list.add(
        books.displayBookInfo();
        System.out.println(BookDTO.getTotalBooks());
    }
}
