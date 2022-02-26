package headfirst.designpatterns.factory.pizzas;

/**
 * Конкретные продукты. Каждый продукт должен реализовать интерфейс
 * Pizza и быть конкретным. Если эти условия выполняются, фабрика создает
 * экземпляр и возвращает его клиенту.
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
