package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ComparatorVsComparable {

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(12);
        num.add(22);
        num.add(18);
        num.add(40);

        System.out.println(num);
        // Collections.sort(num);
        Iterator<Integer> asc = num.descendingIterator();
        while (asc.hasNext()) {
            System.out.println(asc.next());
        }
    }
    
}