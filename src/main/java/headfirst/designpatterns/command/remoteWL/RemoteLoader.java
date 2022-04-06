package headfirst.designpatterns.command.remoteWL;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /*Удаляем весь код создания конкретных объектов Command (вместе с самими
        классами), как было в пакете headfirst.designpatterns.command.remote;.
        Код становится куда более компактным (а от 22 классов остается только 9).
        Подумайте: лямбда-выражение заменяет метод, а не весь объект.
        Заменить два метода одним лямбда-выражением невозможно.*/
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        /*Ссылки на методы классов передаются в качестве команд методу setCommand.
        Мы используем ссылки на методы повсюду, где используются простые команды из одного метода,
        и полные лямбда-выражения там, где одного вызова метода недостаточно. (Ссылку на метод
        можно рассматривать как компактное лямбда-выражение. По сути это одно и то же; ссылка на
        метод — просто сокращенная запись для лямбда-выражения, которое вызывает всего один метод.)*/
//        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(0, "Light in Living Room", livingRoomLight::on, livingRoomLight::off);
//        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(1, "Light in Kitchen", kitchenLight::on, kitchenLight::off);
//        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(2, "Fan", ceilingFan::high, ceilingFan::off);

        /*Лямбда-выражения в качестве реализации метода execute()
         * Это лямбда-выражение выполняет три операции*/
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };

        Command tvOnWithInputChannel = () -> {
            tv.on();
            tv.setInputChannel();
        };

        Command hottubOnWithParameters = ()->{
            hottub.on();
            hottub.bubblesOn();
            hottub.heat();
        };


        /*Здесь можно было передать Лямбда-выражения в качестве команд методу setCommand.*/
//        remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(3, "CD", stereoOnWithCD, stereo::off);
//        remoteControl.setCommand(4, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(4, "Garage Door", garageDoor::up, garageDoor::down);
        remoteControl.setCommand(5, "TV", tvOnWithInputChannel, tv::off);
        remoteControl.setCommand(6, "Hottub", hottubOnWithParameters, hottub::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
    }
}
