package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Sum{
    int sum(int a, int b);
}

@FunctionalInterface
interface Factorial{
    int fact(int a);
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
    
    //problem 2 check if given string is empty. usig lambda func.
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
    List<Integer> numbers = List.of(4,5,1,6,2,3,8,9,1,2,4);
    List<Integer> rrr = numbers.stream().filter(a1 -> a1%2==0).collect(Collectors.toList());
    System.out.println(rrr);

    //problem 5 sort list of string in order.
    List<String> a1 = new ArrayList<>();
    a1.add("jjj");
    a1.add("abc");
    a1.add("qqq");
    a1.add("bbb");
    List<String> sortedA1 = a1.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedA1);

    System.out.println("MTHD-2");
    a1.sort((b1,b2) -> b1.compareToIgnoreCase(b2));
    System.out.println(a1);

    //problem 6 find avg of list of integers.
    double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    System.out.println(avg);

    //problem 7 remove duplicates from list.
    // List<Integer> dupl = numbers.stream().distinct().collect(Collectors.toList());   // OR
    List<Integer> dupl = new ArrayList<>();
    numbers.stream().distinct().forEach(dupl::add);
    System.out.println(dupl);

    //problem 8 calculate factorial of a given number.
    int n1 = 7;
    Factorial f = a11->{
            int p = 1;
            for(int i=1;i<=a11;i++)
                p = p*i;
            return p;
        } 
    ;
    int result1 = f.fact(n1);
    System.out.println("Fact: "+result1);


    
}
}
