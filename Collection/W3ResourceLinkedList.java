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
        System.out.println("Used iterator....desc");
        Iterator<String> desc = ll.descendingIterator();
        while(desc.hasNext())
        System.out.println(desc.next());

        //problem 5 insert specified element in specified position
        ll.add(3, "not");
        System.out.println(ll);

        //problem 6 insert element at first and last position
        ll.addFirst("begin");
        ll.addLast("end");
        System.out.println(ll);

        //problem 7 insert element at front of liked list
        ll.offerFirst("1");             //deque mthd
        System.out.println(ll);

        //problem 8 insert element at the end of liked list
        ll.offerLast("2");              //deque mthd
        System.out.println(ll);

        //
        


    }
     
    
    
}
