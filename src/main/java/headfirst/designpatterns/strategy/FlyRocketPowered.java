package headfirst.designpatterns.strategy;

/**
 * Определяем новое поведение — реактивный полет.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
