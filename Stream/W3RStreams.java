package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class W3RStreams {
    public static void main(String[] args) {

        //problem 1 avg of list of no.s using stream.
        List<Integer> one = List.of(4,2,67,8,3);
        double a = one.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(a);

        //problem 2 covert list of strings from lowercase to uppercase.
        List<String> two = List.of("one","two","three","four");
        List<String> show = two.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(show);

        //problem 3
        int a1 = one.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(a1);

        //problem 4 remove dulicate elements from a list using stream.
        // MTHD 1 MY
        List<Integer> duplicate = List.of(4,1,4,6,2,8,6,8,2);
        System.out.println(duplicate);
        // Set<Integer> a2 = duplicate.stream().collect(Collectors.toSet());
        // System.out.println(a2);

        // MTHD 2
        List<Integer> a2 = duplicate.stream().distinct().collect(Collectors.toList());
        System.out.println(a2);

        //problem 5 count no. of strings starting fro a specific letter using stream
        char f= 't';
        List<String> a3 = two.stream().filter(n -> n.startsWith(String.valueOf(f))).collect(Collectors.toList());
        System.out.println(a3);

        //problem 6 sort list of strings in ascending and descending order.
        List<String> rr = two.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order: "+rr);
        List<String> rr1 = two.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending order: "+rr1);

        //problem 7 find max and min no. using stream.
        int a4 = one.stream().max(Integer::compare).orElse(null);
        int a5 = one.stream().min(Integer::compare).orElse(null);
        System.out.println("Maximum no. is: "+a4);
        System.out.println("Minimum no. is: "+a5);

        //problem 8 Find 2nd smallest and 2nd largest no. in a list using stram.
        int a6 = one.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println("Second minimum no. is: "+a6);

        int a7  =one.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second maximum no. is: "+a7);
    }
}
