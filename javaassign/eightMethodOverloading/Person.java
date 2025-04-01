package eightMethodOverloading;

class Person {

    private String name;
    private int age;
    private String address;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        if (age != 0) {
            System.out.println("Age: " + age);
        }
        if (address != null) {
            System.out.println("Address: " + address);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30, "123 Main St");

        person1.display();
        person2.display();
        person3.display();
    }
}
