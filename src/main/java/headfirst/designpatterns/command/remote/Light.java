package headfirst.designpatterns.command.remote;

/**
 * Классы устройств выполняют
 * непосредственную работу по
 * управлению домашней электроникой.
 * В данном примере используется класс
 * Light.
 * Это один из ПОЛУЧАТЕЛЕЙ
 */
public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}
