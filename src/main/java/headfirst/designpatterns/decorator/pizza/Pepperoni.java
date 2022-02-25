package headfirst.designpatterns.decorator.pizza;

public class Pepperoni extends ToppingDecorator {

	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Pepperoni";
	}
 
	public double cost() {
		return pizza.cost() + .35;
	}
}
