package headfirst.designpatterns.command.undo;

/**
 * В программе создается множество классов команд,
 * в которых упаковываются крошечные блоки вычислений.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //Создание объекта Light
        Light livingRoomLight = new Light("Living Room");

        /*Создаем экземпляры двух команд: для включения и для выключения света.*/
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        //Команды размещаются в ячейке 2.
        remoteControl.setCommand(2, livingRoomLightOn, livingRoomLightOff);

        //Включение
        remoteControl.onButtonWasPushed(2);
        //Выключение
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        //Отмена
        remoteControl.undoButtonWasPushed();
        //Выключение
        remoteControl.offButtonWasPushed(2);
        //Включение
        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        //Отмена
        remoteControl.undoButtonWasPushed();

        //Создание объекта CeilingFan
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        /*Создаем экземпляры трех команд: для высокой, для средней скорости и для выключения вентилятора.*/
        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        /*Команды включения средней и высокой скорости помещаются в ячейки 0 и 1.*/
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        //Сначала включаем среднюю скорость.
        remoteControl.onButtonWasPushed(0);
        //Потом выключаем вентилятор.
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        //Отмена! Снова должна включиться средняя скорость.
        remoteControl.undoButtonWasPushed();

        //Выбираем высокую скорость.
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        //Отмена! Должна вернуться средняя скорость.
        remoteControl.undoButtonWasPushed();
    }
}
