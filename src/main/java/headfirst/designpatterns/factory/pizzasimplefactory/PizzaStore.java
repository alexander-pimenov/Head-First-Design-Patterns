package headfirst.designpatterns.factory.pizzasimplefactory;

/**
 * Клиент фабрики.
 * PizzaStore обращается к SimplePizzaFactory для
 * получения экземпляров пиццы.
 * Все пиццерии вашей сети должны использовать код PizzaStore,
 * чтобы все пиццы готовились по единым правилам.
 */
public class PizzaStore {
    //Классу PizzaStore передается ссылка
    //на SimplePizzaFactory (посредством композиции).
    SimplePizzaFactory factory;

    /**
     * PizzaStore сохраняет ссылку на фабрику в конструкторе.
     *
     * @param factory ссылка на фабрику в конструкторе.
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * Метод обращается к фабрике с запросом на создание
     * объекта, передавая тип заказа.
     * Вызов оператора new заменяется вызовом метода create
     * объекта фабрики. Никаких созданий экземпляров конкретного
     * типа!
     *
     * @param type тип заказа
     * @return объект пицца
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
