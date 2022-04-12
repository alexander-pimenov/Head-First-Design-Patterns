package headfirst.designpatterns.adapter.ducks;

/**
 * Конкретная реализация обобщенного класса Turkey:
 * как и класс Duck, она просто выводит описания
 * своих действий.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
