package headfirst.designpatterns.decorator.starbuzz;

/**
 * Конкретный Декоратор.
 * Здесь принципиально то, что декораторы должны относиться к тому
 * же супертипу, что и декорируемые объекты. Таким образом, наследование
 * применяется для согласования типов, а не для обеспечения поведения.
 * Мы субклассируем абстракный класс Beverage только для приведе-
 * ния к нужному типу, а не для наследования его поведения. Поведение формируется
 * в результате композиции декораторов с базовыми компонентами и другими декора-
 * торами.
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        //для округления до 2-х знаков после запятой используются некоторые присидания
        double scale = Math.pow(10, 2);
        return .10 + Math.ceil(beverage.cost() * scale) / scale;
    }
}
