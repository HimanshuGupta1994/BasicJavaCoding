package CollectionsFramework;

import java.util.*;

public class BasicHashSet {

    public static void main(String[] arg) {
        Set s = new HashSet();
        s.add(100);
        s.add(200);
        s.add('c');
        s.add("Himanshu");
        s.add(100);
        s.add(null);
        s.add(null);
        System.out.println(s);
        Iterator i = s.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
