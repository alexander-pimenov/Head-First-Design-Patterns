package headfirst.designpatterns.factory.pizzafabricmethod;
/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class CaliforniaStyleVeggiePizza extends Pizza {
	public CaliforniaStyleVeggiePizza() {
		name = "California Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella and Gouda Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Bell pepper");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into triangular slices");
	}
}
