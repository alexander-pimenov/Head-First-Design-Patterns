package headfirst.designpatterns.strategy;

/**
 * Утка-приманка (утинный манок) изначально летать не умеет...
 */
public class ModelDuck extends Duck {

    public ModelDuck() {

        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
