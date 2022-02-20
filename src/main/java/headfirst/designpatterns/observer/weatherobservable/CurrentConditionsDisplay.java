package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * В языке Java предусмотрена встроенная поддержка паттерна
 * Наблюдатель:
 * для Субъекта - интерфейс java.util.Observable
 * для Наблюдателя - интерфейс java.util.Observer
 * В некоторых случаях встроенной поддержки Java бывает
 * достаточно, но самостоятельная реализация обладает
 * большей гибкостью.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    Observable observable;

    /**
     * Конструктору передается объект WeatherData, который
     * используется для регистрации элемента в качестве
     * наблюдателя.
     * Объект элемента текущего состояния добавляется
     * в качестве наблюдателя.
     *
     * @param observable Субъект
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this); //Объект элемента текущего состояния добавляется в качестве наблюдателя
    }

    /**
     * Обновленный метод update() получает
     * Observable и необязательные данные.
     * <p>
     * В update() мы сначала проверяем, что Субъект относится к типу
     * WeatherData, затем используем его get-методы для получения
     * температуры и влажности, после чего вызываем display().
     * <p>
     * При использовании паттерна возможен как запрос, так и
     * активная доставка данных от субъекта (запрос считается
     * более «правильным»).
     *
     * @param obs объект Observable
     * @param arg необязательные данные
     */
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
