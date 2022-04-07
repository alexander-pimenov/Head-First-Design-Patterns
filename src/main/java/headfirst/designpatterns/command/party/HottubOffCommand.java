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
public class HottubOffCommand implements Command {
    //Получатель
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
