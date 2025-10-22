package Java8Features.DefaultStaticMethods;

interface Vehicle {
    // Abstract method (no body)
    void start();

    // Default method (has a body)
    default void fuelType() {
        System.out.println("Default fuel type: Petrol");
    }

    // Static method (belongs to interface)
    static void serviceInfo() {
        System.out.println("Service every 6 months");
    }
}

// Implementing class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }

    // Overriding default method (optional)
    @Override
    public void fuelType() {
        System.out.println("Car fuel type: Diesel");
    }
}

public class DefaultStaticExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();         // Calls overridden method
        car.fuelType();      // Calls overridden default method

        // Calling static method of interface
        Vehicle.serviceInfo();
    }
}
