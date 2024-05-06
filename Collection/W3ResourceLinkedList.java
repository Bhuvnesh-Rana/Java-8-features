package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class W3ResourceLinkedList {

    @SuppressWarnings("unchecked")
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

        //problem 9 insert some elements in the LinkedList.
        List<String> newLl = new LinkedList<>();
        newLl.add("Random");
        newLl.add("element");
        ll.addAll(2, newLl);
        System.out.println("List after inserting new elements from: "+ll);

        //problem 10 find the first and last element from the list.
        System.out.println("First element: "+ll.getFirst());
        System.out.println("Last emlement: "+ll.getLast());

        //problem 11 display element and their position in the list.
        for(int i=0;i<ll.size();i++)
            System.out.println("Element present at position: "+i+" is: "+ll.get(i));
        

        //problem 12 remove a specified element from the list.
        ll.remove(1);
        System.out.println("List after removing specified elemet: "+ll);

        //problem 13 remove first and last element from the list.
        ll.removeFirst();
        ll.removeLast();
        System.out.println("List after removing first and last elements: "+ll);

        //problem 14 remove all elements from the list.
        // ll.removeAll();

        //problem 15 swap 2 elements in the list.
        Collections.swap(ll, 7, 8);
        System.out.println("List after swapping elements: "+ll);

        //problem 16 shuffle element in the list.
        Collections.shuffle(ll);
        System.out.println("List elements after shuffling: "+ll);
        
        //problem 17 join 2 Linked lists.
        // ll.addAll(newLl);

        //problem 18 copy a linked list to another.
        List<String> coppy = new LinkedList<>();
        coppy = (List<String>) ll.clone();
        System.out.println("Copied list: "+coppy);

        //problem 19 remove and return first element of the list.
        System.out.println("First element in the list to be removed is: "+ll.removeFirst());    //can use pop
        System.out.println("Remaining list: "+ll);

        //problem 20 retrieve first element of the list.
        System.out.println("First element of the list is: "+ll.peek());

        //problem 21 retrieve last element of the list.
        System.out.println("Last element of the list is: "+ll.peekLast());

        //problem 22 check if a particular element is present in the list or not.
        if (ll.contains("here.")) 
            System.out.println("Element is present.");
        else
            System.out.println("Element not present in the list.");

        //problem 23 covert linked list to an array list.
        List<String> demoArrayList = new ArrayList<>(ll);
        System.out.println("Array List is: ");
        for (String aL : demoArrayList) {
            System.out.println(aL);
        }

        //problem 24 compare to lists.
        List<String> compare = new LinkedList<>();
        for (String q : ll) {
            compare.add(newLl.contains(q) ? "yes":"no");
        }
        System.out.println("List 1: "+ll);
        System.out.println("List 2: "+newLl);
        System.out.println("Comparison list: "+compare);

        //problem 25 check if list is empty or not.
        System.out.println("Is the list empty? "+ll.isEmpty());

        //problem 26 replace an element from the list.
        ll.set(2, "FINISHED");
        System.out.println("List after replacing an element: "+ll);




    }
     
    
    
}
