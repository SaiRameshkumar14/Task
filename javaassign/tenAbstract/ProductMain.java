package javaassign.tenAbstract;

abstract class Product {

    String name;

    Product(String name) {
        this.name = name;
    }

    abstract double getPrice();

    abstract String getDescription();

    void showProduct() {
        System.out.println("Product: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("Price: ₹" + getPrice());
    }
}

class ElectronicsProduct extends Product {

    double price;

    ElectronicsProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return "An electronic item.";
    }
}

class ClothingProduct extends Product {

    double price;

    ClothingProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return "A clothing item.";
    }
}

class BookProduct extends Product {

    double price;

    BookProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return "A book.";
    }
}

public class ProductMain {

    public static void main(String[] args) {
        Product[] cart = {
            new ElectronicsProduct("Headphones", 1200),
            new ClothingProduct("T-Shirt", 500),
            new BookProduct("Java Basics", 300)
        };

        double total = 0;
        for (Product p : cart) {
            p.showProduct();
            total += p.getPrice();
            System.out.println("----------------");
        }

        System.out.println("Total Price: ₹" + total);
    }
}
