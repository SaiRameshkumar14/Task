package seveninheritance;

class Shapes {

    int sides;

    Shapes(int sides) {
        this.sides = sides;
    }

    void self() {
        System.out.println("Hi I am " + this.getClass().getSimpleName());
    }

    void repr() {
        System.out.println("I have " + sides + " sides\n");
    }
}

class Circle extends Shapes {

    Circle(int sides) {
        super(sides == 0 ? 0 : 0);
    }
}

class Rectangle extends Shapes {

    Rectangle(int sides) {
        super(sides);
    }

}

class Square extends Shapes {

    Square(int sides) {
        super(sides);
    }

}

class Triangle extends Shapes {

    Triangle(int sides) {
        super(sides);
    }

}

class Hexagon extends Shapes {

    Hexagon(int sides) {
        super(sides);
    }

}

class Pentagon extends Shapes {

    Pentagon(int sides) {
        super(sides);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Welcome to shapes");

        Circle C = new Circle(2);
        Rectangle R = new Rectangle(4);
        Square S = new Square(4);
        Triangle T = new Triangle(3);
        Hexagon H = new Hexagon(6);
        Pentagon P = new Pentagon(5);

        C.self();
        C.repr();

        R.self();
        R.repr();

        S.self();
        S.repr();

        T.self();
        T.repr();

        H.self();
        H.repr();

        P.self();
        P.repr();

    }

}
