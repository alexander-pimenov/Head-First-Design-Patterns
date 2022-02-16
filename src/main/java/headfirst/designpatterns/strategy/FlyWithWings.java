package headfirst.designpatterns.strategy;

public class FlyWithWings implements FlyBehavior {
    /**
     * Реализация поведения для
     * уток, которые УМЕЮТ летать...
     */
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
