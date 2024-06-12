package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorVsComparable {
//Comparator uses Collections.sort( obj, comparator) can use by implementing comparator or writing inner class.
//Comparable uses Collection.sort(obj)                          ,,
    public static void main(String[] args) {

        //Given int list. sort
        LinkedList<Integer> num = new LinkedList<>();
        num.add(12);
        num.add(22);
        num.add(18);
        num.add(40);

        System.out.println(num);
        Collections.sort(num);
        Collections.sort(num, Collections.reverseOrder());
        Iterator<Integer> asc = num.descendingIterator();
        while (asc.hasNext()) {
            System.out.println(asc.next());
        }
System.out.println("*******************************************************");


        //Sort the list on the basis of last digit only.*(Write ur own logic for sorting.)*
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                }
                return -1;
            }    
        };
        List<Integer> l = new ArrayList<>();
        l.add(22);
        l.add(24);
        l.add(11);
        l.add(9);
        l.add(15);

        Collections.sort(l, com);
        Iterator<Integer> it = l.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

System.out.println("*******************************************************");

        //Sort on the bases of length of string.
        Comparator<String> coms = new Comparator<String>() {

            @Override
            public int compare(String i, String j) {
                if (i.length()>j.length()) {
                    return 1;
                }
                return -1;
            }
            
        };

        List<String> l1 = new ArrayList<>();
        l1.add("Abc");
        l1.add("de");
        l1.add("fghij");
        l1.add("k");
        l1.add("lmno");

        System.out.println("List before comparator sort: "+l1);
        Collections.sort(l1, coms);
        System.out.println("List afte comparator sort: "+l1);

        //*********** Look compstu ********
    }
    
}