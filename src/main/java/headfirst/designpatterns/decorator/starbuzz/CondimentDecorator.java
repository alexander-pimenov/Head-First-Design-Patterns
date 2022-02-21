package headfirst.designpatterns.decorator.starbuzz;

/**
 * Второй базовый класс.
 * Абстрактный класс для дополнений - для Декораторов.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage.
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    /**
     * Метод getDescription() сделали абстрактным,
     * чтобы каждый Компонент реализовал его по
     * своему.
     *
     * @return строковое значение описания
     */
    public abstract String getDescription();
}
