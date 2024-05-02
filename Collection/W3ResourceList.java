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
    
    //problem 13 compare two lists *******************************See ans use contains..
    if (colours.equals(copy)) 
    System.out.println("Lists are equal.");
    else
    System.out.println("Lists are not equal.");   
    
    //problem 14 swap two element in the list
    System.out.println("List before swapping: "+colours);
    Collections.swap(colours, 0, 2);
    System.out.println("List after swapping: "+colours);
    


    }
}