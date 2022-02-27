package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Конкретный создатель.
 * Фабрика по производству пиццы в нью-йоркском стиле:
 * NYStyleCheesePizza, NYStyleVeggiePizza, NYStyleClamPizza, NYStylePepperoniPizza
 * <p>
 * Региональные пиццерии получают всю функциональность PizzaStore
 * бесплатно. Им остается субклассировать PizzaStore и предоставить
 * метод cratePizza(), реализующий их местный стиль приготовления пиццы.
 * <p>
 * createPizza() возвращает объект Pizza, а субкласс NYPizzaStore несет полную
 * ответственность за создаваемый конкретный экземпляр Pizza.
 * <p>
 * Класс NYPizzaStore расширяет PizzaStore, поэтому он наследует метод
 * orderPizza().
 * <p>
 * Метод orderPizza() суперкласса понятия не имеет, какой из типов пиццы
 * мы создаем; он знает лишь то, что пиццу можно приготовить, выпечь, нарезать
 * и упаковать!
 * <p>
 * Все фабричные паттерны инкапсулируют операции создания объектов.
 * Паттерн Фабричный Метод позволяет субклассам решить, какой объект следует
 * создать.
 * <p>
 * NYPizzaStore инкапсулирует сведения о том, как готовить нью-йоркскую пиццу.
 * <p>
 * Класс NYPizzaStore отвечает за создание конкретных продуктов.
 * Это один из трех классов, который располагает информацией о создании этих продуктов.
 */
public class NYPizzaStore extends PizzaStore {

    /**
     * Метод создающий правильную пиццу.
     * Здесь создаются конкретные классы. Для
     * каждого типа пиццы мы создаем реализацию
     * в нью-йоркском стиле.
     * Метод непосредственно производит продукт.
     * <p>
     * Фабричный метод отвечает за создание объектов и
     * инкапсулирует эту операцию в субклассе.
     *
     * @param item тип пиццы
     * @return объект пиццы
     */
    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
