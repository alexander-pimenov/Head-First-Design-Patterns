package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Все фабричные паттерны инкапсулируют операции создания объектов.
 * Паттерн Фабричный Метод позволяет субклассам решить, какой объект
 * следует создать.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        //Создаем фабрику для пиццы в нью-йоркском стиле (пиццерия).
        PizzaStore nyStore = new NYPizzaStore();
        //Создаем фабрику для пиццы в чикагском стиле (пиццерия).
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        //Создаем фабрику для пиццы в калифорнийском стиле (пиццерия).
        PizzaStore californiaStore = new CaliforniaPizzaStore();


        //Метод orderPizza() вызывается для экземпляра
        //nyStore (выполняется метод, определенный
        //в PizzaStore).
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");


        //
        DependentPizzaStore dependentPizzaStore = new DependentPizzaStore();
        Pizza pizzaStorePizza = dependentPizzaStore.createPizza(Style.CHICAGO, Type.PEPPERONI);
        System.out.println("Felix ordered a " + pizzaStorePizza.getName() + "\n");

        //

    }
}
