package headfirst.designpatterns.decorator.starbuzz;

/**
 * Второй базовый класс.
 * Абстрактный класс для дополнений - для Декораторов.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage (так происходит согласование типов).
 * И содержит ссылку на Beverage (композиция).
 */
public abstract class CondimentDecorator extends Beverage {
    //содержит ссылку на Beverage (композиция)
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
