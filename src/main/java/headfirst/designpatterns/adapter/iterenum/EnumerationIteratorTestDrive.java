package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

/**
 * Код работает с итераторами, хотя
 * в основу реализации заложены перечисления.
 */
public class EnumerationIteratorTestDrive {
    public static void main(String args[]) {
//		Vector<String> v = new Vector<String>(Arrays.asList(args));

        Vector<String> v = new Vector<String>(Arrays.asList("1", "2", "3", "4"));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(v.size());
    }
}
