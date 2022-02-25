package headfirst.designpatterns.decorator.starbuzzWithSizes;

/**
 * Второй базовый класс.
 * Абстрактный класс для дополнений - для Декораторов.
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому
 * расширяем класс Beverage (так происходит согласование типов).
 * И обязательно содержит ссылку на объект Beverage (композиция).
 */
public abstract class CondimentDecorator extends Beverage {
    //содержит ссылку на Beverage (композиция)
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String toString() {
        return "CondimentDecorator{" +
                "beverage=" + beverage +
                '}';
    }
}
