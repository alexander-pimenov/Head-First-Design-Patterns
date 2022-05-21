package headfirst.designpatterns.adapter.ducks;

import java.util.Random;

/**
 * Задача паттерна Адаптер — преобразовать один интерфейс
 * к другому интерфейсу.
 * <p>
 * Адаптер связывается с адаптируемым объектом посредством композиции.
 * Дополнительное преимущество такого решения заключается в том, что
 * адаптер будет работать с любым субклассом адаптируемого объекта.
 * <p>
 * В паттерне Адаптер проявляются многие признаки качественного ОО-проектирования:
 * обратите внимание на использование композиции для «упаковки» адаптируемого объ-
 * екта в измененный интерфейс. Дополнительное преимущество такого решения заклю-
 * чается в том, что адаптер будет работать с любым субклассом адаптируемого объекта.
 * <p>
 * Использование композиции дает мне немалые преимущества.
 * Можно адаптировать не только отдельный класс, но и все его субклассы.
 * <p>
 * Теперь Duck адаптируется в Turkey, поэтому реализуем интерфейс Turkey.
 * <p>
 * Прежде всего необходимо реализовать интерфейс того типа, на который
 * рассчитан ваш клиент.
 */
public class DuckAdapter implements Turkey {
    //Адаптируемый под клиента объект (композиция)
    Duck duck;
    Random rand;

    /* Затем следует получить ссылку на адаптируемый объект;
     * обычно это делается в конструкторе.*/
    public DuckAdapter(Duck duck) {
        //Сохраняем ссылку на адаптируемый объект Duck
        this.duck = duck;
        //Случайный объект используется в методе fly()
        rand = new Random();
    }

    /**
     * Адаптер должен реализовать все методы интерфейса.
     * Преобразование gobble() между классами выполняется
     * просто — реализация вызывает quack().
     */
    public void gobble() {
        duck.quack();
    }

    /**
     * Так как утки летают намного дальше индюшек, мы решили, что
     * утка будет летать в среднем один раз из пяти.
     */
    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
