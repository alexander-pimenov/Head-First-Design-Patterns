package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;

/**
 * Паттерн Наблюдатель определяет отношение типа
 * «один-ко-многим» между объектами.
 * Если вы пытаетесь мысленно представить паттерн Наблюдатель,
 * модель подписки с издателями и подписчиками дает неплохое
 * представление о ней.
 * Когда состояние одного объекта (субъекта) изменяется, все
 * зависимые объекты получают оповещения.
 * Наблюдатели зависят от субъекта: при изменении
 * состояния последнего наблюдатели получают оповещения.
 * В зависимости от способа оповещения также возможно об-
 * новление состояния наблюдателей.
 * Существует много разных вариантов
 * реализации паттерна Наблюдатель, но большинство из них
 * строится на основе классов, реализующих интерфейсы субъ-
 * екта или наблюдателя.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * Метод вызывается при каждом
     * обновлении показаний датчиков.
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * Метод вовращает новейшее значение температуры.
     * Нас не интересует, КАК задаются их
     * значения; объект WeatherData знает, как
     * получить обновленную информацию от
     * метеостанции.
     *
     * @return значение температуры
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Метод вовращает новейшее значение влажности.
     * Нас не интересует, КАК задаются их
     * значения; объект WeatherData знает, как
     * получить обновленную информацию от
     * метеостанции.
     *
     * @return значение влажности
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * Метод вовращает новейшее значение давления.
     * Нас не интересует, КАК задаются их
     * значения; объект WeatherData знает, как
     * получить обновленную информацию от
     * метеостанции.
     *
     * @return значение давления
     */
    public float getPressure() {
        return pressure;
    }
}
