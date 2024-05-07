package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class W3ResourceTreeSet {
    
    //problem 1 Create a tree set of colours.
    public static void main(String[] args) {
        Set<String> colours = new TreeSet<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");

        System.out.println("Elements in tree set are: "+colours);


        //problem 2 iterate through all the elements of the set.
        System.out.println("Set elements are:");
        for (String b : colours) 
            System.out.println(b);

        //problem 3 add existing tree set elemnts to a new tree set.
        TreeSet<String> colours1 = new TreeSet<>();
        colours1.add("Pink");
        colours1.addAll(colours);
        System.out.println("Element in new tree set colours2 are: "+colours1);

        //problem 4 reverse the set
        Iterator<String> i = colours1.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //problem 5 get the first and last element of the tree set.
        System.out.println("First element of the tree set "+colours1.first());
        System.out.println("Last element of the tree set: "+colours1.last());

        //problem 6 clone tree set to another tree set
        @SuppressWarnings("unchecked")
        TreeSet<String> cloned = (TreeSet<String>) colours1.clone();
        System.out.println(cloned);

        //problem 7 get number of element in the tree set.
        System.out.println(colours1.size());
        
        //problem 8 compare 2 sets

        //problem 9 numbers less than 7 in a tree set.

        TreeSet<Integer> n = new TreeSet<>();
        n.add(10);
        n.add(4);
        n.add(6);
        n.add(2);

        Set<Integer> one = n.stream().filter(e -> e<7).collect(Collectors.toSet());
        System.out.println("Numbers less than 7"+one);

        //problem 10 numbers >= to a specific number.
        Set<Integer> two = n.stream().filter(e -> e>=4).collect(Collectors.toSet());
        System.out.println("Numbers >= 4 are: "+two);

        //problem 11 numbers <= to a specific number.
        Set<Integer> three = n.stream().filter(e -> e<=6).collect(Collectors.toSet());
        System.out.println("Numbers <= 6 are: "+three);

        //problem 12 numbers > than a specific number.
        Set<Integer> four = n.stream().filter(e -> e>4).collect(Collectors.toSet());
        System.out.println("Numbers > 4 are: "+four);

        //problem 13 numbers < than a specific number.
        Set<Integer> five = n.stream().filter(e -> e<4).collect(Collectors.toSet());
        System.out.println("Numbers < 4 are: "+five);

        //problem 14 retrieve and remove first element of the tree set.

        //problem 15 retrieve and remove last element of the tree set.

        //problem 16 remove a given element from the tree set.



    }
}
