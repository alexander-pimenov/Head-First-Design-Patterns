package headfirst.designpatterns.strategy;

/**
 * Определяем новое поведение — полет с помощью пропеллера.
 */
public class FlyWithPropeller implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with propeller!!");
    }
}
