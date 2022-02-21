package headfirst.designpatterns.decorator.starbuzz;

/**
 * Конкретный Компонент.
 * Класс конкретного напитка.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage.
 */
public class HouseBlend extends Beverage {
    /**
     * Конструктор.
     * Описание задается в конструкторе класса. Стоит напомнить,
     * что переменная description наследуется от Beverage.
     */
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    /**
     * В этом классе беспокоиться о дополнениях (о Декораторах) не
     * нужно, поэтому мы просто возвращаем стоимость «базовой»
     * домашней смеси: $0.89.
     *
     * @return цена домашней смеси
     */
    public double cost() {
        return .89;
    }
}

