// Abstract class (Abstraction)
abstract class Vehicle {
    
    // Abstract method 
    abstract void start();
    
    // Normal method
    void fuelType() {
        System.out.println("Uses petrol");
    }
     void fueltype() {
        System.out.println("Uses Electricity");
    }

}

// car class
class car extends Vehicle {
    
    // Implement abstract method
    void start() {
        System.out.println("Car start with key");
    }
}

// Bike class
class Bike extends Vehicle {
    
    // Implement abstract method
    void start() {
        System.out.println("Bike starts with self start");
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        
        // Creating Scooter object
        car sc = new car();
        sc.start();
        sc.fueltype();
        
        System.out.println();
        
        // Creating Bike object
        Bike bk = new Bike();
        bk.start();
        bk.fuelType();
    }
}