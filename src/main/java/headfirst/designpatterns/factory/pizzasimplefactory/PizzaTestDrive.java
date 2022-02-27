package headfirst.designpatterns.factory.pizzasimplefactory;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);

		pizza = store.orderPizza("clam");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
//ВЫВОД:
//Preparing Cheese Pizza
//Baking Cheese Pizza
//Cutting Cheese Pizza
//Boxing Cheese Pizza
//We ordered a Cheese Pizza
//
//---- Cheese Pizza ----
//Regular Crust
//Marinara Pizza Sauce
//Fresh Mozzarella
//Parmesan
//
//Preparing Veggie Pizza
//Baking Veggie Pizza
//Cutting Veggie Pizza
//Boxing Veggie Pizza
//We ordered a Veggie Pizza
//
//---- Veggie Pizza ----
//Crust
//Marinara sauce
//Shredded mozzarella
//Grated parmesan
//Diced onion
//Sliced mushrooms
//Sliced red pepper
//Sliced black olives
