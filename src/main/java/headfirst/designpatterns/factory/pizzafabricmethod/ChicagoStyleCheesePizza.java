package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}

	/**
	 * Чикагская пицца также переопределяет метод cut():
	 * она нарезается не клиньями, а квадратами.
	 */
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
