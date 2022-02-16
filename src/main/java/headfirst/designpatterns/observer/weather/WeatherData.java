package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Паттерн Наблюдатель определяет отношение типа
 * «один-ко-многим» между объектами.
 * Если вы пытаетесь мысленно представить паттерн Наблюдатель,
 * модель подписки с издателями и подписчиками дает неплохое
 * представление о ней.
 * Когда состояние одного объекта (субъекта) изменяется, все
 * зависимые объекты получают оповещения. Здесь за это отвечаем
 * метод notifyObservers().
 * Наблюдатели зависят от Субъекта: при изменении
 * состояния последнего наблюдатели получают оповещения.
 * В зависимости от способа оповещения также возможно об-
 * новление состояния Наблюдателей.
 * Существует много разных вариантов реализации паттерна
 * Наблюдатель, но большинство из них строится на основе
 * классов, реализующих интерфейсы Субъекта или Наблюдателя.
 * Субъект реализует интерфейс Subject. Кроме методов реги-
 * страции и исключения, субъект также реализует метод
 * notifyObservers(), оповещающий всех текущих наблюдателей
 * об изменении состояния.
 * <p>
 * Субъект также может иметь get- и set-методы для изменения
 * состояния.
 * <p>
 * Так как Субъект является едино-
 * личным владельцем данных, работа На-
 * блюдателей зависит от Субъекта, опове-
 * щающего их об изменении данных. Так
 * формируется элегантная ОО-структура,
 * в которой многие объекты используют
 * одни и те же данные.
 * <p>
 * Если два объекта могут взаимодействовать, не обладая практически
 * никакой информацией друг о друге, такие объекты называют СЛАБОСВЯЗАННЫМИ.
 * В архитектуре паттерна Наблюдатель между субъектами и наблюдателями
 * существует слабая связь.
 * Единственное, что знает субъект о наблюдателе, — то, что тот реализует
 * некоторый интерфейс (Observer). Ему не нужно знать ни конкретный класс
 * наблюдателя, ни его функциональность... ничего.
 * Новые наблюдатели могут добавляться в любой момент. Так как субъект
 * зависит только от списка объектов, реализующих интерфейс Observer, вы
 * можете добавлять новых наблюдателей по своему усмотрению. Любого
 * наблюдателя во время выполнения можно заменить другим наблюдателем или
 * исключить его из списка — субъект этого не заметит.
 */
public class WeatherData implements Subject {
    //Добавление новых типов наблюдателей не требует модификации субъекта.
    private List<Observer> observers;

    //Класс WeatherData обладает состоянием: температура, влажность, давление
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //при создании Субъекта нуен только контейнер для хранения ссылок на Наблюдателей
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Метод, вызываемый при изменениях состояния Субъекта,
     * чтобы вызвать метод оповещения Наблюдателей.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Сеттер для изменения состояния Субъекта.
     *
     * @param temperature входящее значение температуры
     * @param humidity    входящее значение влажности
     * @param pressure    входящее значение давления
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
