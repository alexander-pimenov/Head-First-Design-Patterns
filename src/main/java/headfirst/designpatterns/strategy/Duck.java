package headfirst.designpatterns.strategy;

/**
 * Структура, в которой Duck не является
 * интерфейсом, имеет свои преимущества: она позволяет конкрет-
 * ным подклассам уток (например, MallardDuck) наследовать об-
 * щие свойства и методы. После исключения переменных аспектов
 * из иерархии Duck мы пользуемся преимуществами этой структу-
 * ры без всяких проблем.
 * <p>
 * У новой структуры есть одна принципиальная особенность:
 * класс Duck теперь делегирует свои аспекты поведения
 * (вместо простого использования методов, определенных
 * в классе Duck или его субклассах).
 * <p>
 * Сначала в класс Duck включаются две переменные экземпляров flyBehavior
 * и quackBehavior, объявленные с типом интерфейса (а не с типом конкретного
 * класса реализации). Каждый объект на стадии выполнения присваивает этим
 * переменным полиморфные значения, соответствующие конкретному типу по-
 * ведения (FlyWithWings, Squeak и т. д.).
 * Т.е. во время выполнения переменной присваивается ссылка на конкретное поведение.
 * Каждый объект Duck содержит ссылку на реализацию интерфейса QuackBehavior и FlyBehavior.
 * Вместо того, чтобы выполнять действие само-
 * стоятельно, объект Duck просто поручает эту работу объекту, на
 * который ссылается quackBehavior и flyBehavior.
 * В этой части, когда нас совершенно не интересует, что это за объект,
 * — важно лишь, чтобы он умел выполнять quack() и fly()!
 * Методы fly() и quack() удаляются из класса Duck (и всех субклассов), потому
 * что это поведение перемещается в классы FlyBehavior и QuackBehavior.
 * В классе Duck методы fly() и quack() заменяются двумя аналогичными
 * методами: performFly() и performQuack(); (выполнитьПолет, выполнитьКряканье)
 * <p>
 * Согласитесь, обидно было бы наделить наших уток возможностями ди-
 * намической смены поведения — и не использовать их! Предположим, вы
 * хотите, чтобы тип поведения задавался set-методом подкласса (вместо
 * создания экземпляра в конструкторе).
 * Вызывая эти методы в любой момент, мы можем изме-
 * нить поведение утки «на лету».
 * <p>
 * Каждая утка СОДЕРЖИТ экземпляры FlyBehavior и QuackBehavior,
 * которым делегируются выполнение соответствующих операций.
 */
public abstract class Duck {
    //Каждый объект Duck содержит ссылку на реализацию интерфейса QuackBehavior и FlyBehavior.
    /*Объявляем две ссылочные переменные с типами
    интерфейсов поведения. Переменные наследуются всеми
    субклассами Duck (в том же пакете).*/
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * Сеттер для динамической смены поведения
     *
     * @param fb поведение ЛЕТАТЬ
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * Сеттер для динамической смены поведения
     *
     * @param qb поведение КРЯКАТЬ
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    /**
     * Объект Duck делегирует
     * поведение объекту, на который
     * ссылается flyBehavior.
     */
    public void performFly() {
        //Делегирование операции классам поведения.
        flyBehavior.fly();
    }

    /**
     * Объект Duck делегирует
     * поведение объекту, на который
     * ссылается quackBehavior.
     */
    public void performQuack() {
        //Делегирование операции классам поведения.
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
