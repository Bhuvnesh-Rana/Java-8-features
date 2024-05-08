package Lambda;

import java.util.List;

interface Sum{
    int sum(int a, int b);
}

public class W3RLambdaEpr {
public static void main(String[] args) {
    
    //problem 1 find sum of 2 integers using lambda functions.
    //using stream.
    // List<Integer> num = List.of(1,2);
    // int sum = num.stream().mapToInt(Integer::intValue).sum();
    // System.out.println(sum);

    Sum summ = (a,b)->a+b;
    int result = summ.sum(2, 2);
    System.out.println(result);
    
    
    
}
}
