package Java8Features.StreamAPI.main;

import java.util.function.Predicate;

class Predicates {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
    }

}