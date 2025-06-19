package javaassign.tenAbstract;

abstract class Document {

    String title;

    Document(String title) {
        this.title = title;
    }

    abstract void open();

    abstract void close();

    void showTitle() {
        System.out.println("Document Title: " + title);
    }
}

class PDFDocument extends Document {

    PDFDocument(String title) {
        super(title);
    }

    void open() {
        System.out.println("Opening PDF Document...");
    }

    void close() {
        System.out.println("Closing PDF Document...");
    }
}

class TextDocument extends Document {

    TextDocument(String title) {
        super(title);
    }

    void open() {
        System.out.println("Opening Text Document...");
    }

    void close() {
        System.out.println("Closing Text Document...");
    }
}

class ImageDocument extends Document {

    ImageDocument(String title) {
        super(title);
    }

    void open() {
        System.out.println("Opening Image Document...");
    }

    void close() {
        System.out.println("Closing Image Document...");
    }
}

public class DocumentMain {

    public static void main(String[] args) {
        Document[] docs = {
            new PDFDocument("Resume"),
            new TextDocument("Notes"),
            new ImageDocument("Photo")
        };

        for (Document doc : docs) {
            doc.showTitle();
            doc.open();
            doc.close();
            System.out.println();
        }
    }
}
