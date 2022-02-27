package headfirst.designpatterns.factory.pizzasimplefactory;

/**
 * Конкретные продукты. Каждый продукт должен реализовать интерфейс
 * Pizza и быть конкретным. Если эти условия выполняются, фабрика создает
 * экземпляр и возвращает его клиенту.
 */
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
