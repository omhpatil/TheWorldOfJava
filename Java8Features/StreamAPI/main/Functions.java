package Java8Features.StreamAPI.main;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        Function<String, Integer> strLength = str -> str.length();
        String text = "Hello, World!";
        int length = strLength.apply(text);
        System.out.println("The length of the string is: " + length);

    }
}
