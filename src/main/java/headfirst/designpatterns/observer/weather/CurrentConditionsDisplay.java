package headfirst.designpatterns.observer.weather;

/**
 * Наблюдатели могут относиться к лю-
 * бому классу, реализующему интерфейс
 * Observer. Каждый наблюдатель реги-
 * стрируется у конкретного субъекта
 * для получения обновлений.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    /**
     * Конструктору передается
     * объект WeatherData, который
     * используется для регистрации
     * элемента в качестве наблюда-
     * теля.
     *
     * @param weatherData объект Субъекта
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * При вызове update() мы сохраняем
     * значения температуры и влажности,
     * после чего вызываем display().
     * <p>
     * При использовании паттерна возможен как запрос, так и
     * активная доставка данных от субъекта (запрос считается
     * более «правильным» - как в примере
     * headfirst.designpatterns.observer.weatherobservable.CurrentConditionsDisplay).
     *
     * @param temperature температура
     * @param humidity    влажность
     * @param pressure    давление
     */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * Метод для вывода текущих параметров.
     * Метод display() просто
     * выводит текущие значения
     * температуры и влажности.
     */
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
