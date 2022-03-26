package headfirst.designpatterns.command.simpleremote;

/**
 * Этот класс - Клиент в терминологии паттерна.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
		/*Объект remote — Инициатор; ему будет
		передаваться объект команды.*/
        SimpleRemoteControl remote = new SimpleRemoteControl();

        /*Создание объекта Light и garageDoor, которые будут
        Получателеми запроса.*/
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        /*Создание объектов команды с указанием Получателя*/
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDown = new GarageDoorDownCommand(garageDoor);
        Command garageLightOn = new GarageLightOnCommand(garageDoor);
        Command garageLightOff = new GarageLightOff(garageDoor);


        /*Команда передается Инициатору.*/
        remote.setCommand(lightOn);
        /*Имитируем нажатие кнопки.*/
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

        remote.setCommand(garageDown);
        remote.buttonWasPressed();

        remote.setCommand(garageLightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageLightOff);
        remote.buttonWasPressed();
    }

}
