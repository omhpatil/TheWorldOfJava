package Java8Features.StreamAPI.streamapimethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(3,6,4,2,1,5);

        // Sorted in Ascending Order
        List<Integer> SortedEleASC = ls.stream().sorted().toList();
        System.out.println(SortedEleASC);

        // Sorted in Descending Order
        List<Integer> SortedEleDESC = ls.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(SortedEleDESC);

    }
}
