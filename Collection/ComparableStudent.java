package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }
    @Override
    public int compareTo(Student i) {
        if (this.rollNo > i.rollNo) {
            return 1;
        }
        return -1;
    }
}

public class ComparableStudent {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student("ABcd", 4));
        l.add(new Student("Random", 2));
        l.add(new Student("Jkl", 1));
        l.add(new Student("Opui", 3));

        Collections.sort(l);
        for (Student student : l) {
            System.out.println(student);
        }
    }
}
