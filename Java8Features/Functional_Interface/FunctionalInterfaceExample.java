package Java8Features.Functional_Interface;

// Step 1: Create a functional interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);  // only one abstract method
}

// Step 2: Implement and use it with a lambda
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // Lambda to add two numbers
        Calculator add = (a, b) -> a + b;

        // Lambda to multiply two numbers
        Calculator multiply = (a, b) -> a * b;

        // Using the functional interface methods
        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Multiplication: " + multiply.calculate(5, 3));
    }
}

