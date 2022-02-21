package headfirst.designpatterns.decorator.starbuzz;

/**
 * Конкретный Компонент.
 * Класс конкретного напитка.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage.
 */
public class DarkRoast extends Beverage {
    /**
     * Конструктор.
     * Описание задается в конструкторе класса. Стоит напомнить,
     * что переменная description наследуется от Beverage.
     */
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    /**
     * В этом классе беспокоиться о дополнениях (о Декораторах) не
     * нужно, поэтому мы просто возвращаем стоимость «базовой»
     * темной обжарки кофе: $0.99.
     *
     * @return цена кофе темной обжарки
     */
    public double cost() {
        return .99;
    }
}

