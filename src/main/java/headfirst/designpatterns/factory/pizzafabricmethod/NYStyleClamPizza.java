package headfirst.designpatterns.factory.pizzafabricmethod;
/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
