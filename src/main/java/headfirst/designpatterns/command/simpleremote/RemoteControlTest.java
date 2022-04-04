package headfirst.designpatterns.command.simpleremote;

/**
 * Этот класс - Клиент в терминологии паттерна.
 * Клиент отвечает за создание объекта команды, содержащего
 * набор операций с получателем.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
		/*Объект remote — Инициатор;
		ему будет передаваться объект команды.*/
        SimpleRemoteControl remote = new SimpleRemoteControl();

        /*Создание объекта Light и garageDoor, которые будут
        Получателеми запроса.*/
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        /*Создание объектов команды с указанием Получателя*/
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDown = new GarageDoorDownCommand(garageDoor);
        Command garageLightOn = new GarageLightOnCommand(garageDoor);
        Command garageLightOff = new GarageLightOffCommand(garageDoor);


        /*Команда передается Инициатору.*/
        /*Клиент вызывает метод setCommand() Инициатора и передает
        ему объект команды. Инициатор сохраняет последний до момента использования.
        Команда, загруженная Инициатором, может как уничтожаться после выполнения,
        так и оставаться для повторного использования.*/
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

        remote.setCommand(lightOff);
        remote.buttonWasPressed();


    }

}
