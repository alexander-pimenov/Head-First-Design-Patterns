package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
    public static void main(String args[]) {

        //		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));

        ArrayList<String> l = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
