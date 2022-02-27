package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Конкретный создатель.
 * Фабрика по производству пиццы в нью-йоркском стиле:
 * CaliforniaStyleCheesePizza, CaliforniaStyleVeggiePizza,
 * CaliforniaStyleClamPizza, CaliforniaStylePepperoniPizza.
 * <p>
 * Региональные пиццерии получают всю функциональность PizzaStore
 * бесплатно. Им остается субклассировать PizzaStore и предоставить
 * метод cratePizza(), реализующий их местный стиль приготовления пиццы.
 * <p>
 * createPizza() возвращает объект Pizza, а субкласс CaliforniaPizzaStore несет полную
 * ответственность за создаваемый конкретный экземпляр Pizza.
 * <p>
 * Класс CaliforniaPizzaStore расширяет PizzaStore, поэтому он наследует метод
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
 * CaliforniaPizzaStore инкапсулирует все сведения о том, как готовить калифорнийскую
 * пиццу.
 * <p>
 * Класс CaliforniaPizzaStore отвечает за создание конкретных продуктов.
 * Это один из трех классов, который располагает информацией о создании этих продуктов.
 */
public class CaliforniaPizzaStore extends PizzaStore {

    /**
     * Метод создающий правильную пиццу.
     * Здесь создаются конкретные классы. Для
     * каждого типа пиццы мы создаем реализацию
     * в калифорнийском стиле.
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
                return new CaliforniaStyleCheesePizza();
            case "veggie":
                return new CaliforniaStyleVeggiePizza();
            case "clam":
                return new CaliforniaStyleClamPizza();
            case "pepperoni":
                return new CaliforniaStylePepperoniPizza();
            default:
                return null;
        }
    }
}
