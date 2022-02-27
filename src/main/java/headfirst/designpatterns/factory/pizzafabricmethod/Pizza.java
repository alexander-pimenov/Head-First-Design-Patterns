package headfirst.designpatterns.factory.pizzafabricmethod;

import java.util.ArrayList;

/**
 * АбстрактнЫЙ класс Pizza, который станет суперклассом для конкретных (продуктов)
 * классов пиццы.
 * Фабрики производят продукты;
 * у класса PizzaStore продуктом является Pizza.
 */
public abstract class Pizza {
	//Каждый объект Pizza содержит название name,
	//тип основы dough, тип соуса sauce и набор добавок toppings.
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	/**
	 * Приготовление пиццы (метод prepare) состоит из нескольких шагов,
	 * выполняемых в определенной последовательности.
	 */
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

 
 
