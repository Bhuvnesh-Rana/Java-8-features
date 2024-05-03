package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * W3ResourceList
 */
public class W3ResourceList {
    public static void main(String[] args) {
        
    //problem 1 create list of colours.   
    List<String> colours = new ArrayList<>();
    colours.add("Red");
    colours.add("Green");
    colours.add("Blue");
    colours.add("Yellow");

    System.out.println(colours);

    //problem 2 iterate the list.
    for(String a:colours){
        System.out.println(a);
    }

    //problem 3 add element at 1st position.
    colours.add(0, "White");
    System.out.println("List after adding colour at first position: "+colours);

    //problem 4 retrieve a specific element from the list.
    String colourAtAnIndex = colours.get(3);
    System.out.println("Element at indec no. 3: "+colourAtAnIndex);

    //problem 5 update an colour from list by new colour.
    colours.set(1, "Orange");
    System.out.println("List after updating colour: "+colours);

    //problem 6 remove element at index 3 from the list.
    colours.remove(3);
    System.out.println("List after removing element from index no. 3: "+colours);

    //problem 7 Search for an element in the list.
    String find="Red";
    if (colours.contains(find))
        System.out.println("Colour "+find+" is present inthe list.");
    else
    System.out.println("Colour "+find+" is not present inthe list.");

    // problem 8 Sort the given array list.
    Collections.sort(colours);
    System.out.println("Colours after sorting: "+colours);

    //problem 9 copy one list to another.
    List<String> copy = new ArrayList<>();
    copy.add("one");
    copy.add("two");
    copy.add("three");
    copy.add("four");
    System.out.println("Initial list copy: "+copy);
    Collections.copy(copy, colours);                    //target list shoulld be of same size or bigger.
    System.out.println("Copied List copy is: "+copy);

    //problem 10 shuffle the list.
    Collections.shuffle(colours);
    System.out.println("List after shuffling: "+colours);

    //problem 11 reverse element in the lisr.
    Collections.reverse(colours);
    System.out.println("List after reversing: "+colours);

//      method 2 
//      System.out.println("List after reversing: ");
//      for(int i=colours.size()-1;i>=0;i--){
//      System.out.println(colours.get(i));
//      }

    //problem 12 extract portion of a list
    System.out.println("Colours from index 1 to 3: "+colours.subList(1, 4));//to index is not included
    
    //problem 13 compare two lists 
    List<String> c = new ArrayList<>();
    for (String e : colours) {
        c.add(copy.contains(e)? "yes":"no");
    }   
    System.out.println("List colours: "+colours);
    System.out.println("List copy: "+copy);
    System.out.println(c);
    
    //problem 14 swap two element in the list
    System.out.println("List before swapping: "+colours);
    Collections.swap(colours, 0, 2);
    System.out.println("List after swapping: "+colours);

    //problem 15 join two lists
    List<String> join = new ArrayList<>();
    join.addAll(colours);
    join.addAll(copy);
    System.out.println("New joined list is: "+join);

    //problem 16 clone a list to another.
            //CLONE 

    
    //problem 17 empty a list.
    join.removeAll(join);
    System.out.println("join list: "+join);

    //problem 18 check if list is empty.
    if (join.isEmpty()) {
        System.out.println("The list join is empty.");
    }
    else
    System.out.println("List is not empty..");

    //problem 19 trimming the capacity of the list.         ??
    ArrayList<Integer> q = new ArrayList<>();
    q.add(1);
    q.add(2);
    q.trimToSize();
    q.add(22);
    System.out.println(q);

    //problem 20 increase array list size.             ????
    q.ensureCapacity(2);
    System.out.println(q);

    //problem 21 relpace element from the list.
    colours.set(1, "Brown");
    System.out.println("Colours list after replacing 2nd element: "+colours);

    //problem 22 print all elements of an list.
    System.out.println("Printing List colours.");
    for (String f : colours) 
        System.out.println(f);

    }
}