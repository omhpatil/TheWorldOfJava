package Java8Features.LambdaExpression;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Alice", "Om");

        // 1) Sort using a lambda as a Comparator (ascending)
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // 2) Print each name using forEach with a lambda
        names.forEach(name -> System.out.println(name));
    }
}

