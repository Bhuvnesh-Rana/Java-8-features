package Lambda;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Sum{
    int sum(int a, int b);
}

public class W3RLambdaExpr {
public static void main(String[] args) {
    
    //problem 1 find sum of 2 integers using lambda functions.
    //using stream.
    // List<Integer> num = List.of(1,2);
    // int sum = num.stream().mapToInt(Integer::intValue).sum();
    // System.out.println(sum);

    Sum summ = (a,b)->a+b;
    int result = summ.sum(2, 2);
    System.out.println(result);
    
    //problem 2 check if given string is empty. usih lambda func.
    String a="";
    System.out.println(a.isEmpty());

    //problem 3 Convert list of string to upper or lowercase.
    String abc = "we";
    System.out.println(abc.toUpperCase());

    // List<String> alpha = List.of("random","words","are","entered","here");
    // alpha.replaceAll(r ->r.toUpperCase());
    // for (String rr : alpha) {
    //     System.out.println(rr);
    // }

    //problem 4 filter out even and odd numbers from a list.
    List<Integer> numbers = List.of(4,5,1,6,2,3,8,9);
    List<Integer> rrr = numbers.stream().filter(a1 -> a1%2==0).collect(Collectors.toList());
    System.out.println(rrr);

    
}
}
