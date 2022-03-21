package headfirst.designpatterns.singleton.stat;

/**
 * Если приложение всегда создает и использует экземпляр
 * синглетного класса или затраты за создание не столь
 * существенны, экземпляр можно создать заранее.
 * Экземпляр Singleton создается в статическом инициализаторе.
 * Потоковая безопасность этого кода гарантирована!
 * <p>
 * При таком подходе мы доверяем JVM создание уникального
 * экземпляра Singleton при загрузке класса. JVM гарантирует,
 * что экземпляр будет создан до того, как какой-либо поток
 * сможет обратиться к статической переменной uniqueInstance
 */
public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
