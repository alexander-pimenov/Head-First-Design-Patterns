package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        //Реализовать классы поведения можно и через лямбды, т.к. эти интерфейсы содержат
        //только один метод, т.е. их можно назвать функциональными интерфейсами.
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");


        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        Duck model = new ModelDuck(); //Утка-приманка изначально летать не умеет...

        /*Вызов метода performQuack(),
        унаследованного классом MallardDuck, RubberDuck, DecoyDuck, ModelDuck;
        метод делегирует выполнение операции по ссылке на QuackBehavior (то есть
        вызывает quack() через унаследованную переменную quackBehavior).
        */
        mallard.performQuack();
        rubberDuckie.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();

        /*Вызов метода performFly(),
        унаследованного классом MallardDuck, RubberDuck, DecoyDuck, ModelDuck;
        метод делегирует выполнение операции по ссылке на FlyBehavior (то есть
        вызывает fly() через унаследованную переменную flyBehavior).*/
        mallard.performFly();
        rubberDuckie.performFly();
        rubberDuck.performFly();
        decoy.performFly();


        mallard.display();
        rubberDuckie.display();
        rubberDuck.display();
        decoy.display();


        /*Здесь наблюдаем способность утки-приманки к полету переключается
        динамически! Если бы реализация находилась в иерархии Duck, ТАКОЕ было
        бы невозможно.
        Поведение утки во время выполнения изменяется простым вызовом set-метода.*/
        /*Первый вызов performFly() передается реализации,
        заданной в конструкторе ModelDuck — то есть экземпляру FlyNoWay.*/
        model.performFly();
        /*Вызываем set-метод, унаследованный классом ModelDuck, и...
        утка-приманка вдруг взлетает на реактивном двигателе!*/
        model.setFlyBehavior(new FlyRocketPowered()); //меняем поведение
        model.performFly();
        //Еще один финт ушами и... утка-приманка вдруг летит на супер ракетной тяге! Тут помогла лямбда!!!
        //И не надо писать дополнительный класс!
        model.setFlyBehavior(() -> System.out.println("Лечу на супер ракетной тяге!!!")); //установил с помощью лямбды новое поведение
        model.performFly();

        /*Или еще раз для запоминания: создаем MallardDuck с новыми не стандартными поведениями
        * Лямбда помогла, не пришлось создавать доп классы.*/
        FlyBehavior flyByOneWing = ()-> System.out.println("Лечу на одном крыле !!! Второе затято телефоном !!!");
        QuackBehavior quackAnother = ()-> System.out.println("Да, сегодня я не крякаю, а говорю человеческим языком !!!");
        Duck mallardDuck = new MallardDuck(flyByOneWing, quackAnother);
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
