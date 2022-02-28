package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * Клиенты «Абстрактной Фабрики» — два экземпляра
 * PizzaStore: NyPizzaStore и ChicagoStylePizzaStore.
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
     * <p>
     * Фабрика ингредиентов выбирается и создается в PizzaStore,
     * а затем передается конструктору каждой пиццы.
     *
     * @param item тип пиццы
     * @return объект пиццы
     */
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        //Фабрика производит ингредиенты для всех пицц
        //в нью-йоркском стиле.
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            //(*)
            // Теперь при создании каждой пиццы задается фабрика,
            // которая должна использоваться для производства ее
            // ингредиентов. Для каждого вида пиццы создаем новый
            // экземпляр Pizza и передаем ему фабрику, необходимую
            // для производства ингредиентов.
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            //(*)
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            //(*)
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            //(*)
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
