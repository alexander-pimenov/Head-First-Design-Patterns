package headfirst.designpatterns.decorator.starbuzz;

/**
 * Первый базовый класс.
 * Абстактный класс Компонента. Хотя можно использовать и интерфейс.
 * Здесь принципиально то, что Декораторы должны относиться к тому
 * же супертипу, что и декорируемые объекты (Компоненты). Таким образом,
 * наследование применяется для согласования типов, а не для обеспечения
 * поведения.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
