package headfirst.designpatterns.factory.pizzasimplefactory;

/**
 * Конкретные продукты. Каждый продукт должен реализовать интерфейс
 * Pizza и быть конкретным. Если эти условия выполняются, фабрика создает
 * экземпляр и возвращает его клиенту.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
