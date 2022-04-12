package headfirst.designpatterns.adapter.ducks;

/**
 * Простейшие реализации выводят сообщения
 * о выполняемой операции
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
