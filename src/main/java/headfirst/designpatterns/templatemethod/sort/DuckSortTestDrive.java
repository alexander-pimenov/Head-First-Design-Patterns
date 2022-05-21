package headfirst.designpatterns.templatemethod.sort;

import java.util.Arrays;

/**
 * Поскольку метод sort() все-таки не определяется в супер-классе, он должен знать,
 * что вы реализовали метод compareTo(); в противном случае у него не хватит
 * информации для определения полного алгоритма сортировки.
 * Реализовали метод compareTo() в классе Duck.
 * Итак, для сортировки объектов Duck необходимо реализовать метод compareTo();
 * тем самым вы предоставите классу Arrays информацию, необходимую для завершения
 * алгоритма сортировки.
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        //Создаем массив объектов Duck.
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    /**
     * Метод выводит на экран значения name и weight.
     *
     * @param ducks массив Duck
     */
    public static void display(Duck[] ducks) {
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }
}
