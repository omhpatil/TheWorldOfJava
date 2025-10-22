package Java8Features.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Creating an Optional that has a value
        Optional<String> name = Optional.of("Om");

        // Creating an empty Optional (no value)
        Optional<String> empty = Optional.empty();

        // Check if value is present
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // Safe way to handle empty Optional
        System.out.println("Empty Optional: " + empty.orElse("No name provided"));
    }
}

