package headfirst.designpatterns.decorator.starbuzz;

/**
 * Конкретный Компонент.
 * Класс конкретного напитка.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage.
 */
public class Decaf extends Beverage {
    /**
     * Конструктор.
     * Описание задается в конструкторе класса. Стоит напомнить,
     * что переменная description наследуется от Beverage.
     */
    public Decaf() {
        description = "Decaf Coffee";
    }

    /**
     * В этом классе беспокоиться о дополнениях (о Декораторах) не
     * нужно, поэтому мы просто возвращаем стоимость «базового»
     * кофе без кофейна: $1.09.
     *
     * @return цена кофе без кофеина
     */
    public double cost() {
        return 1.05;
    }
}

