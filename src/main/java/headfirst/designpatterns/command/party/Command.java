package headfirst.designpatterns.command.party;

/**
 * Команда — не более чем упакованный блок вычислений.
 * Команды позволяют определить общий интерфейс для поведения
 * многих разных приемников (осветительных систем, джакузи,
 * стереосистем), каждый из которых обладает собственным набором
 * действий.
 * <p>
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
public interface Command {
    /*Набор операций*/
    public void execute();

    public void undo();
}
