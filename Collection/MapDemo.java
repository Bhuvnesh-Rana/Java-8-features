package Collection;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap; //Use if want map output in sorted way on the bases of key.

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>();
        a.put("Abcd", 1);
        a.put("efgh", 4);
        a.put("ijk", 2);
        a.put("lmno", 3);

        System.out.println(a);

        for (String s : a.keySet()) {
            System.out.println(s +" : "+a.get(s));
        }
    }
}
