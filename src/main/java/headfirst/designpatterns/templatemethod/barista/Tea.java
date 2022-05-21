package headfirst.designpatterns.templatemethod.barista;

/**
 * Как и в исходной архитектуре, Tea и Coffee расширяют класс CaffeineBeverage.
 */
public class Tea extends CaffeineBeverage {

    /*Класс Tea должен определить brew() и addCondiments() — два абстрактных метода из Beverage.*/

    /**
     * Метод заваривания чая — только субкласс знает, как
     * это правильно делается
     */
    public void brew() {
        System.out.println("Steeping the tea");
    }

    /**
     * В чай кладутся добавки, специфические для конкретного
     * напитка, поэтому операция реализуется в субклассе
     */
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
