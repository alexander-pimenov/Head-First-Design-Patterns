package headfirst.designpatterns.singleton.dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//
//К сожалению, многие реализации ключевого
//слова volatile в Java 1.4 и более ранних версиях
//допускают неверную синхронизацию условной
//блокировки. Условная блокировка не
//работает в Java 1.4 и более
//ранних версиях!

/**
 * Ключевое слово volatile гарантирует, что параллельные
 * программные потоки будут правильно работать с переменной
 * uniqueInstance при ее инициализации экземпляром Singleton.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * Здесь синхронизация выполняется только при
     * первом вызове!
     *
     * @return объект класса Singleton
     */
    public static Singleton getInstance() {
        //Проверяем экземпляр;
        //если он не существует — входим в блок synchronized.
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                //Внутри блока повторяем проверку,
                //и если значение все еще равно
                //null — создаем экземпляр.
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
