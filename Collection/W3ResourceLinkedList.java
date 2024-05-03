package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class W3ResourceLinkedList {

    public static void main(String[] args) {


        //problem 1 append list.
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Random");
        ll.add("words");
        ll.add("are");
        ll.add("entered");
        ll.add("here.");
        System.out.println("Linked list is: "+ll);

        //problem 2 Iterate through all element of the list.
        for (String all : ll) 
            System.out.println(all);

        //problem 3 iterate through the list from a specified position.
        System.out.println("Used iterator....");
        Iterator<String> asc = ll.listIterator(1);
        while(asc.hasNext())
        System.out.println(asc.next());

        //problem 4 iterate the linked list in reverse order.
        System.out.println("Used iterator....");
        Iterator<String> desc = ll.descendingIterator();
        while(desc.hasNext())
        System.out.println(desc.next());


    }
     
    
    
}
