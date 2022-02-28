package headfirst.designpatterns.factory.pizzaabstractfactory;

public abstract class PizzaStore {

    /**
     * Фабричный метод приготовления пиццы.
     *
     * @param item тип пиццы
     * @return объект пиццы
     */
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
