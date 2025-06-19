
public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(4, 6),
            new Triangle(5, 3)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea() + "\n");
        }
    }
}

class Shape {

    Shape(String shape) {
        System.out.println("Creating a Shape " + shape);
    }

    void draw(String shape) {
        System.out.println("Drawing a Shape" + shape);
    }

    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {

    double width, height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        draw(" rectangle");
        return width * height;
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        draw(" triangle");
        return 0.5 * base * height;
    }
}
