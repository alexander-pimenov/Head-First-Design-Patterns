package headfirst.designpatterns.various_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AppTest {
    static String str;

    public static void main(String[] args) {
        List intList = new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(1.2);
        intList.add(1.1);
        intList.add("1.1");
        System.out.println(intList.size());
        Object x = intList.get(3);
        System.out.println(x);

        run();
    }

    static void run() {
        str = "привет";

        //Референс на метод должен идти после инициализации объекта (str = "привет";)
        //иначе получим NPE !!!
        //И референс на метод сразу вызовет метод этого объекта, т.е. сразу произойдет toUpperCase
        //а результат сможем вызвать позже и получим ПРИВЕТ!!!
        Supplier<String> s1 = str::toUpperCase;
        //Лямбда захватит ту переменную, которая будет на момент вызова метода get()
        //А в этой строке мы только её объявим !!!
        //Поэтому получим HELLO
        Supplier<String> s2 = () -> str.toUpperCase();

        str = "hello";

        System.out.println(s1.get()); //ПРИВЕТ
        System.out.println(s2.get()); //HELLO
    }
}
