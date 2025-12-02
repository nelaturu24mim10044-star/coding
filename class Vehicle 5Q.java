class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts ");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts ");
    }
}

class Truck extends Vehicle {
    void start() {
        System.out.println("Truck starts");
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

