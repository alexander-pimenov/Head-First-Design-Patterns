package headfirst.designpatterns.adapter.ducks;

import headfirst.designpatterns.adapter.ducks.challenge.Drone;
import headfirst.designpatterns.adapter.ducks.challenge.DroneAdapter;
import headfirst.designpatterns.adapter.ducks.challenge.SuperDrone;

/**
 * Класс Клиент.
 * Работает с объектами имеющими определенный целевой
 * интерфейс.
 * Обратите внимание: Клиент полностью изолирован
 * от Адаптера; они ничего не знают друг о друге.
 * Клиент получает результаты вызова, даже не подозре-
 * вая о преобразованиях, выполненных адаптером.
 * <p>
 * Также обратите внимание на то, что паттерн связывает клиента с интерфейсом, а не
 * с реализацией; мы можем использовать несколько адаптеров, каждый из которых вы-
 * полняет преобразование для своего набора классов. Кроме того, новые реализации мо-
 * гут добавляться позднее. Единственным ограничением является лишь их соответствие
 * интерфейсу Target.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        //Создаем объект Duck
        Duck duck = new MallardDuck();
        //Создаем объект Turkey
        Turkey turkey = new WildTurkey();

        // Затем Turkey упаковывается в TurkeyAdapter и начинает
        // выглядеть, как Duck.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        //Тестируем методы Turkey.
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        //Теперь вызываем метод testDuck(), который получает объект Duck.
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        //Важный тест: выдаем Turkey за Duck
        //Метод testDuck() и не подозревает, что он имеет дело с
        // объектом Turkey, замаскированным под Duck!
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        // Challenge
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
