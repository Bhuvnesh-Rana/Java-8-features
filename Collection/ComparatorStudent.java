package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


class Student{
    String name;
    int rollNo;

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
 
}


public class ComparatorStudent {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student("Happy", 4));
        st.add(new Student("Random", 2));
        st.add(new Student("Jkl", 1));
        st.add(new Student("Opui", 3));

        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.rollNo > j.rollNo) {
                    return 1;
                }
                return -1;
            }
        };

        System.out.println("Before sorting on the bases of rollNo.:");
        Iterator<Student> it = st.listIterator();       //mthd 1 of iterating using iterator.
        while (it.hasNext()) {
            System.out.println(it.next());      //used toString in Studen class (otherwise printing obj with classname@hashcode.)
        }

        Collections.sort(st,comp);

        System.out.println();
        System.out.println("After sorting on the bases of rollNo.:");
        for (Student student : st) {                    // mthd 2 of iterating using foreach.
            System.out.println(student);
        }

    }
}
