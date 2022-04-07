package headfirst.designpatterns.command.party;

/**
 * Команды обеспечивают механизм инкапсуляции
 * «вычислительных блоков» (получатель + набор опе-
 * раций) и передачи их в виде полноценных объектов.
 * При этом сами операции могут инициироваться на-
 * много позже создания объекта команды в клиент-
 * ском приложении (и даже в другом программном
 * потоке). Этот сценарий находит применение во
 * многих полезных приложениях: планировщиках, пу-
 * лах потоков, очередях заданий и т. д.
 */
public class StereoOnCommand implements Command {
    //Получатель
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
