package headfirst.designpatterns.templatemethod.sort;

/**
 * Шаблонный метод sort из класса Arrays определяет алгоритм, но мы должны
 * указать ему, как сравнить два объекта, а для этого нужно реализовать
 * метод compareTo()
 */
public class Duck implements Comparable<Duck> {
    //Переменные экземпляров.
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Объект Duck просто выводит значения переменных name
     * и weight.
     *
     * @return строковое представление объекта
     */
    public String toString() {
        return name + " weighs " + weight;
    }

    /**
     * Метод compareTo() сравнивает два объекта и возвращает информацию об их
     * соотношении (первый объект меньше второго, больше либо равен ему).
     * Метод sort() использует его для сравнения объектов в массиве.
     * Метод compareTo() получает другой объект Duck и сравнивает его с ТЕКУЩИМ
     * объектом Duck.
     *
     * @param otherDuck другой объект Duck
     * @return целочисленное число
     */
    public int compareTo(Duck otherDuck) {

        /*Здесь определяется правило сравнения объектов Duck. Если значение переменной
        weight ТЕКУЩЕГО объекта Duck меньше значения weight объекта otherDuck, метод
        возвращает -1; если они равны — возвращает 0; а если больше — возвращает 1.*/
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}
