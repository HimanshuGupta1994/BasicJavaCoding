package CollectionsFramework;

import java.util.*;

public class BasicArrayList {

    public static void main(String[] arg) {
        List l = new ArrayList();
        l.add(100);
        l.add(200);
        l.add('c');
        l.add("Himanshu");
        l.add(100);
        l.add(null);
        l.add(null);
        System.out.println(l);
        Iterator i = l.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        ListIterator li = l.listIterator();
        while (li.hasNext())
            System.out.println(li.next());
    }
}
