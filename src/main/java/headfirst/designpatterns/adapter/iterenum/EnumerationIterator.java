package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

/**
 * EnumerationIterator — это адаптер.
 * Чтобы адаптер воспринимался клиентским кодом как итератор,
 * он реализует интерфейс Iterator.
 * Итак, наш адаптер должен реализовать целевой интерфейс Iterator, и адаптируемый
 * объект Enumeration должен включаться в него посредством композиции.
 * Методы hasNext() и next() имеют четкие аналоги в адаптируемом и целевом интерфейсе:
 * их можно просто передавать напрямую.
 * А метод remove() будет объявлен, как не поддерживаемый.
 * В данной ситуации адаптер не идеален; клиенты должны следить за потенциальны-
 * ми исключениями. Но если клиент будет достаточно осторожен, а адаптер — хоро-
 * шо документирован, такое решение вполне приемлемо.
 * Адаптируемый класс реализует интерфейс Enumeration.
 */
public class EnumerationIterator implements Iterator<Object> {
    //Адаптиру емый объект Enumeration сохраняется в переменной (композиция).
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Метод hasNext() интерфейса Iterator передает управление методу
     * hasMoreElements() интерфейса Enumeration...
     *
     * @return true or false depending on the result
     */
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    /**
     * Метод next() интерфейса Iterator передает управление методу
     * nextElement().
     *
     * @return объект типа Object
     */
    public Object next() {
        return enumeration.nextElement();
    }

    /**
     * К сожалению, поддержать метод remove() интерфейса
     * Iterator не удастся, поэтому мы просто
     * инициируем исключение.
     */
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
