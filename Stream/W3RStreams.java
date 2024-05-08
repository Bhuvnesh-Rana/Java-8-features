package Stream;

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
    }
}
