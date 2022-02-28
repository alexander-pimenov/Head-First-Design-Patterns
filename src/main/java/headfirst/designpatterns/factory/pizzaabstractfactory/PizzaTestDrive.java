package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * Абстрактная Фабрика основана на композиции: создание объектов реализуется
 * в методе, доступ к которому осуществляется через интерфейс фабрики.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {

        //Создаем фабрику для пиццы в нью-йоркском стиле (пиццерия).
        PizzaStore nyStore = new NYPizzaStore();
        //Создаем фабрику для пиццы в чикагском стиле (пиццерия).
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
