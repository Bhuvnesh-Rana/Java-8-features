package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionList {



    public static void main(String[] args) {

        Integer n =Integer.valueOf(4);
        System.out.println(n);

        List<Integer> l=List.of(1,2,3,4);

        //print using stream
        List<Integer> d =l.stream().map(e ->e).collect(Collectors.toList());
        System.out.println("Stream "+d);
        
        
        //Syso
        System.out.println("New "+l);

        //adv for loop
        for(Integer m:l){
            System.out.println("In for "+m);
        }



        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);

        System.out.println(a1);
        a1.add(1, 40);           //.get,.add,.remove,.set,.contain, etc

        //reverse array list

        List<Integer> r1 = new ArrayList<>();
        r1.add(3);
        r1.add(4);
        r1.add(8);
        r1.add(1);
        System.out.println("List before reversal: ");
        System.out.println(r1);
        System.out.println("List after reversal: ");
        for(int i=r1.size()-1;i>=0;i--){
            System.out.print(r1.get(i)+" ");
        }
        
        System.out.println();


        System.out.println("List before reversing "+r1);
        Collections.reverse(r1);
        System.out.println("List after reversal: "+r1);
        Collections.sort(r1,Collections.reverseOrder());        //passed comparator.
        System.out.println("descending order: "+r1);

        System.out.println("*********************");


        //problem 1.. Sum of 2 array element should be = k
        int a[]={-5,-1,2,7,11,15};
        int k=6;

        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){			
            if(a[i]+a[j]==k && a[i]!=a[j])
            System.out.println(i +" "+ j);;
        }
}

    //problem 2... reverse array
    int a2[]={1,4,6,2};
    System.out.println("size"+a2.length);
    System.out.println("Array before reversal.. ");
    for(int q:a2){
        
        System.out.print(q+" ");
    }
    System.out.println();
    System.out.println("Array after reversal.. ");
    for(int i=a2.length-1;i>=0;i--){
        System.out.print(a2[i]+" ");
    }

    }


}

    

