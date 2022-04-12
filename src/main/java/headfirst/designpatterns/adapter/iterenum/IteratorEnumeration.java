package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

/**
 * IteratorEnumeration — это адаптер.
 * Чтобы адаптер воспринимался клиентским кодом как перечисление,
 * он реализует интерфейс Enumeration.
 * Итак, наш адаптер должен реализовать целевой интерфейс Enumeration, и адаптируемый
 * объект Iterator должен включаться в него посредством композиции.
 * Методы hasMoreElements() и nextElement() имеют четкие аналоги в адаптируемом и целевом интерфейсе:
 * их можно просто передавать напрямую.
 * Адаптируемый класс реализует интерфейс Iterator.
 */
public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
