package headfirst.designpatterns.decorator.starbuzzWithSizes;

import lombok.Builder;

public class Whip extends CondimentDecorator {

	@Builder
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
