package headfirst.designpatterns.command.simpleremote;

/**
 * Класс команды должен реализовать интерфейс Command.
 * Команда - "открыть дверь гаража"
 * Объект команды инкапсулирует запрос посредством привяз-
 * ки набора операций к конкретному получателю.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    /**
     * В переменной garageDoor конструктору передается
     * конкретный объект, которым будет управлять
     * команда (допустим, открытие двери гаража).
     * При вызове execute получателем запроса будет
     * объект garageDoor.
     *
     * @param garageDoor объект ПОЛУЧАТЕЛЯ запроса
     */
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    /**
     * Метод execute вызывает метод up() объекта-получателя
     * (то есть гаражной системы).
     */
    public void execute() {
        garageDoor.up();
    }
}
