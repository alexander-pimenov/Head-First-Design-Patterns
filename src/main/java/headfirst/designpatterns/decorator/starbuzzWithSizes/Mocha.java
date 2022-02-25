package headfirst.designpatterns.decorator.starbuzzWithSizes;

import lombok.Builder;

public class Mocha extends CondimentDecorator {

    @Builder
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.VENTI) {
            cost += .10;
        } else if (beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .20;
        }
        return cost;
    }
}