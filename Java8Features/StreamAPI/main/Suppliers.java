package Java8Features.StreamAPI.main;

import java.util.Random;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
        System.out.println("Random Number: " + randomNumberSupplier.get());
        System.out.println("Random Number: " + randomNumberSupplier.get());
    }
}
