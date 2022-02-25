package headfirst.designpatterns.decorator.pizza;

public class SalamiSausage extends ToppingDecorator {

	public SalamiSausage(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Salami sausage";
	}
 
	public double cost() {
		return pizza.cost() + .38;
	}
}
