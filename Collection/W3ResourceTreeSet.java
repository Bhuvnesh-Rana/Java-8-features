package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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


    }
}
