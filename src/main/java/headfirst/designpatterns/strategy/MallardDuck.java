package headfirst.designpatterns.strategy;

/**
 * При создании экземпляра MallardDuck конструктор инициа-
 * лизирует унаследованную переменную экземпляра quackBehavior
 * новым экземпляром типа Quack (класс конкретной
 * реализации QuackBehavior).
 * То же самое происходит и с другим аспектом поведения: кон-
 * структор MallardDuck инициализирует переменную flyBehavior
 * экземпляром типа FlyWithWings (класс конкретной реа-
 * лизации FlyBehavior).
 */
public class MallardDuck extends Duck {

    /**
     * Запомните, что MallardDuck наследует переменные quackBehavior
     * и flyBehavior от класса Duck.
     * <p>
     * MallardDuck использует класс Quack для выполнения
     * действия, так что при вызове performQuack()
     * ответственность за выполнение возлагается на объект Quack.
     * Аналогично с FlyWithWings для performFly().
     */
    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    /**
     * Этот конструктор для того, чтобы при создании утки MallardDuck можно
     * было так же передавать нужные ей сейчас поведения, а не так как
     * это в конструкторе по умолчанию - поведения строго определенные.
     *
     * @param flyBehavior   поведение Летать
     * @param quackBehavior поведение Крякать
     */
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
