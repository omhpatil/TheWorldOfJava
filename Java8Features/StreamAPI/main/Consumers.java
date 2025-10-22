package Java8Features.StreamAPI.main;

import java.util.function.Consumer;

class Consumers {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println("My name is " + name);
        printName.accept("Om");
        printName.accept("Patil");
    }

}
