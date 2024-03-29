package headfirst.designpatterns.observer.weather;

/**
 * Интерфейс Субъекта.
 * Используется объектами для регистрации в качестве наблюдателя,
 * а также исключения из списка, а также оповещении Наблюдателя.
 * Каждый Субъект может иметь много Наблюдателей.
 * Наблюдатели могут относиться к любому классу, реализующему
 * интерфейс Observer. Каждый Наблюдатель регистрируется у
 * конкретного Субъекта для получения обновлений.
 * <p>
 * В паттерне Наблюдатель Субъект обладает состоянием и управляет им.
 * Таким образом, существует ОДИН субъект, обладающий состоянием.
 * (Смотри дальше, класс WeatherData обладает состоянием: температура,
 * влажность, давление)
 * С другой стороны, Наблюдатели используют состояние, хотя и не
 * обладают им. Они зависят от субъекта, который оповещает их об
 * изменении состояния. Возникает отношение, в котором участвует ОДИН
 * субъект и МНОГО наблюдателей. (1:M)
 * <p>
 * Так как Субъект является единоличным владельцем данных, работа
 * Наблюдателей зависит от Субъекта, оповещающего их об изменении данных.
 * Так формируется элегантная ОО-структура,  в которой многие объекты
 * используют одни и те же данные.
 * <p>
 * Единственное, что знает субъект о наблюдателе, — то, что тот
 * реализует некоторый интерфейс (Observer).
 * <p>
 * Добавление новых типов Наблюдателей не требует модификации Субъекта.
 * Допустим, у нас появился новый класс, который должен стать Наблюдателем.
 * Вносить изменения в Субъект не потребуется — достаточно реализовать
 * интерфейс Observer в новом классе и зарегистрировать его в качестве
 * Наблюдателя. Субъект будет доставлять оповещения любому объекту,
 * реализующему интерфейс Observer.
 * <p>
 * Изменения в Субъекте или Наблюдателе не влияют на другую сторону.
 * Благодаря слабым связям мы можем вносить любые изменения на любой из
 * двух сторон — при условии, что объект реализует необходимый интерфейс
 * Субъекта или Наблюдателя.
 * <p>
 * Субъекты и Наблюдатели могут повторно использоваться независимо друг от
 * друга. Между ними не существует сильных связей, что позволяет повторно
 * использовать их для других целей.
 */
public interface Subject {
    //Оба метода получают в аргументе реализацию Observer
    //(регистрируемый или исключаемый наблюдатель).
    /**
     * Метод регистрации Наблюдателя.
     *
     * @param o наблюдатель
     */
    public void registerObserver(Observer o);

    /**
     * Метод удаления Наблюдателя.
     *
     * @param o наблюдатель
     */
    public void removeObserver(Observer o);

    /**
     * Этом метод вызывается для оповещения Наблюдателей
     * об изменении состояния субъекта.
     */
    public void notifyObservers();
}
