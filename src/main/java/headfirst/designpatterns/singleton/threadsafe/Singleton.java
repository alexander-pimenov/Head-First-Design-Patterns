package headfirst.designpatterns.singleton.threadsafe;

/**
 * На самом деле ситуация с синхронизацией серьезная:
 * синхронизация актуальна только при первом вызове этого метода.
 * Иначе говоря, после того, как переменной uniqueInstance
 * будет присвоен экземпляр синглетного класса, необходи-
 * мость в дальнейшей синхронизации этого метода отпадает.
 * После первого выполнения синхронизация только приводит
 * к лишним затратам ресурсов!
 *
 * Синхронизация getInstance() — простое и эффективное решение.
 * Только помните, что синхронизация метода может замедлить его
 * выполнение в сто и более раз.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    }

    /**
     * Включая в объявление getInstance() ключевое слово
     * synchronized, мы заставляем каждый поток дождаться своей
     * очереди для входа в него. Иначе говоря, два потока не смогут
     * войти в метод одновременно.
	 * Но синхронизация обходится недешево.
     *
     * @return объект класса Singleton
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
