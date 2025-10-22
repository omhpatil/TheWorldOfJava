package Java8Features.StreamAPI.streamapimethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamAPI {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(30);

        // Without Stream API
//		List<Integer> al = new ArrayList<>();			// Finding Number Even Number
//		for (Integer I : l) {
//			if (I % 2 == 0) {
//				al.add(I);
//			}
//		}
//		System.out.println(al);

        List<Integer> al = new ArrayList<>(); // Multiplying Element in List By 2
        for (Integer I : l) {
            al.add(I * 2);
        }
        System.out.println(al);

        // With Stream API
//		List<Integer> al2 = l.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//		System.out.println(al2);

        List<Integer> al2 = l.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(al2);

    }

}
