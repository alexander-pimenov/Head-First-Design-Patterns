package headfirst.designpatterns.singleton.chocolate;

/**
 * Ниже приведен код класса, управляющего Choc-O-Holic — мощным
 * высокопроизводительным нагревателем для шоколада. Просмотрите код;
 * вы заметите, что автор постарался сделать все возможное, чтобы избежать
 * некоторых неприятностей — скажем, слива холодной смеси, переполнения
 * или нагревания пустой емкости!
 * <p>
 * Паттерн Одиночка предоставляет глобальную точку доступа к экземпляру:
 * обратившись с запросом к классу в любой точке программы, вы
 * получите ссылку на единственный экземпляр.
 * Это отложенное создание экземпляра, что особенно важно для
 * объектов, создание которых сопряжено с большими затратами
 * ресурсов.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    /**
     * Код выполняется только при пустом нагревателе!
     */
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * Метод getInstance() объявлен статическим, что позволяет
     * легко вызвать его в любом месте с использованием
     * синтакиса Singleton.getInstance(). Этот способ
     * ничуть не сложнее обращения к глобальной переменной,
     * но он обладает дополнительными преимуществами — такими,
     * как отложенная инициализация.
     *
     * @return объект класса ChocolateBoiler
     */
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler <" + uniqueInstance + ">");
        return uniqueInstance;
    }

    /**
     * Метод для наполнения нагревателя молочно-шоколадной смесью
     * Перед наполнением мы проверяем, что нагреватель пуст, а после
     * наполнения устанавливаем флаги empty и boiled.
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Заполнение нагревателя молочно-шоколадной смесью
            System.out.println("Заполняем нагревателя молочно-шоколадной смесью");
        }
    }

    /**
     * Чтобы слить содержимое, мы проверяем, что нагреватель не
     * пуст, а смесь доведена до кипения. После слива флагу empty
     * снова присваивается true.
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
            System.out.println("Сливаем нагретое молоко и шоколад");
            empty = true;
        }
    }

    /**
     * Чтобы вскипятить смесь, мы проверяем, что нагреватель
     * полон, но еще не нагрет. После нагревания флагу boiled
     * присваивается true.
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Довести содержимое до кипения
            System.out.println("Доводим содержимое до кипения");

            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
