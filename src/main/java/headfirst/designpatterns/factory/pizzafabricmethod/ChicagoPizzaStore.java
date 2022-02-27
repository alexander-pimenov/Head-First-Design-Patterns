package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Конкретный создатель.
 * Фабрика по производству пиццы в чикагском стиле:
 * ChicagoStyleCheesePizza, ChicagoStyleVeggiePizza,
 * ChicagoStyleClamPizza, ChicagoStylePepperoniPizza
 * <p>
 * Региональные пиццерии получают всю функциональность PizzaStore
 * бесплатно. Им остается субклассировать PizzaStore и предоставить
 * метод cratePizza(), реализующий их местный стиль приготовления пиццы.
 * <p>
 * createPizza() возвращает объект Pizza, а субкласс ChicagoPizzaStore
 * несет полную ответственность за создаваемый конкретный экземпляр Pizza.
 * <p>
 * Класс ChicagoPizzaStore расширяет PizzaStore, поэтому он наследует метод
 * orderPizza().
 * Метод orderPizza() суперкласса понятия не имеет, какой из типов пиццы
 * мы создаем; он знает лишь то, что пиццу можно приготовить, выпечь, нарезать
 * и упаковать!
 * <p>
 * Все фабричные паттерны инкапсулируют операции создания объектов.
 * Паттерн Фабричный Метод позволяет субклассам решить, какой объект следует
 * создать.
 * <p>
 * ChicagoPizzaStore инкапсулирует все сведения о том, как готовить чикагскую пиццу.
 * <p>
 * Класс ChicagoPizzaStore отвечает за создание конкретных продуктов.
 * Это один из трех классов, который располагает информацией о создании этих продуктов.
 */
public class ChicagoPizzaStore extends PizzaStore {

    /**
     * Метод создающий правильную пиццу.
     * Здесь создаются конкретные классы. Для
     * каждого типа пиццы мы создаем реализацию
     * в чикагском стиле.
     * Метод непосредственно производит продукт.
     * <p>
     * Фабричный метод отвечает за создание объектов и
     * инкапсулирует эту операцию в субклассе.
     *
     * @param item тип пиццы
     * @return объект пиццы
     */
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
