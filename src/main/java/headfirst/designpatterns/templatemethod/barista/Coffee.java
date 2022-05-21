package headfirst.designpatterns.templatemethod.barista;

/**
 * Как и в исходной архитектуре, Tea и Coffee расширяют класс CaffeineBeverage.
 */
public class Coffee extends CaffeineBeverage {

    /*Класс Coffee должен определить brew() и addCondiments() — два абстрактных метода из Beverage.*/

    /**
     * Метод заваривания кофе — только субкласс знает, как
     * это правильно делается
     */
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    /**
     * В кофе кладутся добавки, специфические для конкретного
     * напитка, поэтому операция реализуется в субклассе
     */
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
