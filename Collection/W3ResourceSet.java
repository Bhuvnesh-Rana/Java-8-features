package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class W3ResourceSet {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //problem 1 append specified elements in the set.
        Set<String> firstSet = new HashSet<>();
        firstSet.add("New");
        firstSet.add("hash");
        firstSet.add("set");
        firstSet.add("created.");
        firstSet.add("New");

        System.out.println("FirstSet: "+firstSet);
        System.out.println("Size is: "+firstSet.size());

        //problem 2 iterate through all the elements in the set.
        for (String itr : firstSet) {
            System.out.println(itr);
        }

        //problem 3 find the size of the set.
        System.out.println("Number of elements in the set are: "+firstSet.size());

        //problem 4 empty the set.
        firstSet.removeAll(firstSet);
        System.out.println(firstSet);

        //problem 5 check if set is empty or not.
        if (firstSet.isEmpty()) 
            System.out.println("The set is empty");
        else
            System.out.println("Set is not empty.");

        //problem 6 clone a set from another set.
        HashSet<String> secondSet = new HashSet<>();
        secondSet.add("random");
        secondSet.add("shuffled");
        secondSet.add("are");
        secondSet.add("present in the set.");
        firstSet = (HashSet<String>) secondSet.clone();
        System.out.println("First set is: "+firstSet);
        System.out.println("Second set is "+secondSet);

        //problem 7 convert hash set to an array.
        String[] a = new String[firstSet.size()];
        firstSet.toArray(a);
        System.out.println("Array elements are: ");
        for (String pr : a)
            System.out.println(pr);

        //problem 8 convert hash set to tree set.
        Set<String> firstTreeSet = new TreeSet<String>(firstSet);       //sort auto, capital alpha come first????
        System.out.println("Hash Set elements are: "+firstSet);
        System.out.println("Tree Set elements are: ");
        for (String pr1 : firstTreeSet) 
            System.out.println(pr1);

        //problem 9 find numbers less than 7 in the tree set
        Set<Integer> n = new TreeSet<Integer>();
        n.add(1);
        n.add(9);                                       //DOES NOT HAVE INDEX SO USE STREAM FILTER.
        n.add(4);
        n.add(10);
        n.add(3);
        n.add(8);
        n.add(2);
        Long s = n.parallelStream().filter(e -> e<7).count();
        System.out.println(s);
        System.out.println( n.stream().filter(r ->r>7).collect(Collectors.toSet()));

        //problem 10 compare 2 hash set.
        Set<Integer> n1 = new HashSet<>();
        n1.add(1);
        n1.add(9);                                       //DOES NOT HAVE INDEX SO USE STREAM FILTER.
        n1.add(4);
        n1.add(10);
        Set<String> nCompareN1= new HashSet<>();
        for (Integer q : n) 
            nCompareN1.add(n1.contains(q)? "yes":"no");

           System.out.println(nCompareN1);


        //problem 11 compare 2 sets and retain same elements.
        n.retainAll(n1);
        System.out.println(n);
            
        //problem 12 remove all element from set.
        n.clear();
        System.out.println(n);
        
        

        

    }
}
