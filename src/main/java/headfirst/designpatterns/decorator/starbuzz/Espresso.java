package headfirst.designpatterns.decorator.starbuzz;

/**
 * Конкретный Компонент.
 * Класс конкретного напитка.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage.
 */
public class Espresso extends Beverage {

    /**
     * Конструктор.
     * Описание задается в конструкторе класса. Стоит напомнить,
     * что переменная description наследуется от Beverage.
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * В этом классе беспокоиться о дополнениях (о Декораторах) не
     * нужно, поэтому мы просто возвращаем стоимость «базового»
     * эспрессо: $1.99.
     *
     * @return цена эспрессо
     */
    public double cost() {
        return 1.99;
    }
}

