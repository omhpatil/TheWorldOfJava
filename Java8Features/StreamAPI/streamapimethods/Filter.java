package Java8Features.StreamAPI.streamapimethods;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);

        // Find even numbers
        List<Integer> list = al.stream().filter((n)-> n%2==0).toList();
        System.out.println(list);

        // Name starts with 'A'
        List<String> names = Arrays.asList("Om", "Jay", "Jagdish");
        List<String> ls = names.stream().filter(name -> name.startsWith("O")).toList();
        System.out.println(ls);

    }
}

