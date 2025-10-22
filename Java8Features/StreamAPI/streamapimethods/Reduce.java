package Java8Features.StreamAPI.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(2,3,4,5,6);

        // Finding Maximum
        Optional<Integer> maxElement = li.stream().reduce((a, b)->a>b?a:b);
        System.out.println(maxElement);

        // Sum of all element
        Optional<Integer> sum = li.stream().reduce((a, b)-> a+b);
        System.out.println(sum);

        // int sum = numbers.stream().reduce(0, Integer::sum);

        // Concatenating String
        List<String> lii = Arrays.asList("Om", "Jay", "Jagdish");
        Optional<String> os = lii.stream().reduce((a,b)->a+" "+b);
        System.out.println(os);

    }
}
