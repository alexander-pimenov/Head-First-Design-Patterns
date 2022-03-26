package headfirst.designpatterns.command.simpleremote;

//
// This is the invoker - это вызывающий
//

/**
 * Допустим, пульт оснащен всего одной кнопкой и имеет всего
 * одну ячейку для хранения управляемого устройства.
 * Объект SimpleRemoteControl — Инициатор (тот кто вызывает);
 * ему будет передаваться объект команды.
 */
public class SimpleRemoteControl {
    /**
     * Всего одна ячейка для хранения команды
     * (и одно управляемое устройство).
     */
    Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * Метод для назначения команды. Может
     * вызываться повторно, если клиент кода
     * захочет изменить поведение кнопки.
     *
     * @param command объект Команды
     */
    public void setCommand(Command command) {
        slot = command;
    }

    /**
     * Метод, вызываемый при нажатии кнопки. Мы
     * просто берем объект команды, связанный с текущей
     * ячейкой, и вызываем его метод execute().
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
