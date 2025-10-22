package Java8Features.StreamAPI.streamapimethods;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {

    List<Integer> li = Arrays.asList(1,2,3,4,5);
    List<Integer> squaredList = li.stream().map(n->n*n).toList();
    System.out.println(squaredList);

    }
}


        // Use .collect(Collectors.toList()) if you need a modifiable list.
        // Use .toList() for a cleaner syntax when working with an immutable list.