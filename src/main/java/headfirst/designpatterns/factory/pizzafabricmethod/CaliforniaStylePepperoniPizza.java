package headfirst.designpatterns.factory.pizzafabricmethod;
/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class CaliforniaStylePepperoniPizza extends Pizza {
	public CaliforniaStylePepperoniPizza() {
		name = "California Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Double Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting pizza into triangular slices");
	}
}
