class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}

class Truck extends Vehicle {
    void start() {
        System.out.println("Truck started");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();
        
        
        v1.start();
        v2.start();
        v3.start();
        }
    }

// OUTPUT:
// Car started
// Bike started
// Truck started


