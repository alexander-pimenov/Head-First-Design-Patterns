package headfirst.designpatterns.command.party;

/**
 * В программе создается множество классов команд,
 * в которых упаковываются крошечные блоки вычислений.
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        /*Создание объектов устройств (свет, телевизор, стерео, джакузи).*/
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        /*Сначала создается набор команд, которые войдут в макропоследовательность.*/
        /*Создание команд включения для управления этими устройствами.*/
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        /*Создание команд выключения для управления этими устройствами.*/
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        /*Создаем два массива (включение и выключение), которые заполняются соответствующими командами*/
        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        /*и создаем два объекта макрокоманд, в которых массивы команд хранятся.*/
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        /*Макрокоманда связывается с кнопкой, как и любая другая команда.*/
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        //нажимаем кнопки
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
