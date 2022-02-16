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
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	/**
	 * Метод для вывода текущих параметров.
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
