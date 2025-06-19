package seveninheritance;

// Parent class
class Vehicles {

    String name;
    int capacity;

    Vehicles(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Vehicles: " + name + ", Capacity: " + capacity);
    }
}

// Intermediate class for Land Vehicles
class LandVehicle extends Vehicles {

    int wheels;

    LandVehicle(String name, int capacity, int wheels) {
        super(name, capacity);
        this.wheels = wheels;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels: " + wheels);
    }
}

// Intermediate class for Water Vehicles
class WaterVehicle extends Vehicles {

    String propulsionType;

    WaterVehicle(String name, int capacity, String propulsionType) {
        super(name, capacity);
        this.propulsionType = propulsionType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Propulsion Type: " + propulsionType);
    }
}

// Intermediate class for Air Vehicles
class AirVehicle extends Vehicles {

    int wingspan;

    AirVehicle(String name, int capacity, int wingspan) {
        super(name, capacity);
        this.wingspan = wingspan;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

// Specific Vehicle Types
class Car extends LandVehicle {

    Car(String name, int capacity) {
        super(name, capacity, 4);
    }
}

class Bike extends LandVehicle {

    Bike(String name, int capacity) {
        super(name, capacity, 2);
    }
}

class Boat extends WaterVehicle {

    Boat(String name, int capacity) {
        super(name, capacity, "Motor");
    }
}

class Ship extends WaterVehicle {

    Ship(String name, int capacity) {
        super(name, capacity, "Diesel Engine");
    }
}

class Airplane extends AirVehicle {

    Airplane(String name, int capacity) {
        super(name, capacity, 50);
    }
}

class Helicopter extends AirVehicle {

    Helicopter(String name, int capacity) {
        super(name, capacity, 15);
    }
}

// Main class to test the hierarchy
public class Vehicle {

    public static void main(String[] args) {
        System.out.println("Vehicle Hierarchy Demonstration\n");

        Vehicles car = new Car("Sedan", 5);
        Vehicles bike = new Bike("Sports Bike", 2);
        Vehicles boat = new Boat("Speedboat", 6);
        Vehicles ship = new Ship("Cruise Ship", 500);
        Vehicles airplane = new Airplane("Boeing 747", 400);
        Vehicles helicopter = new Helicopter("Rescue Chopper", 10);

        car.displayInfo();
        System.out.println();

        bike.displayInfo();
        System.out.println();

        boat.displayInfo();
        System.out.println();

        ship.displayInfo();
        System.out.println();

        airplane.displayInfo();
        System.out.println();

        helicopter.displayInfo();
    }
}
