package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

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
        ListIterator li = l.listIterator();
        li.next();
        li.next();
        while (li.hasPrevious())
            System.out.println("previous" + li.previous());
        li.set(500);
        li.add(700);
        Iterator i = l.iterator();

        System.out.println("ListIterator" + l);
    }
}
