package headfirst.designpatterns.factory.pizzafabricmethod;
/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza() {
		name = "California Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella and Gouda Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into triangular slices");
	}
}
