package headfirst.designpatterns.command.simpleremote;

/**
 * Класс команды должен реализовать интерфейс Command.
 * Команда - "выключить свет"
 * Объект команды инкапсулирует запрос посредством привяз-
 * ки набора операций к конкретному получателю.
 */
public class LightOffCommand implements Command {
    Light light;

    /**
     * В переменной light конструктору передается
     * конкретный объект, которым будет управлять
     * команда (допустим, освещение в гостиной).
     * При вызове execute получателем запроса будет
     * объект light.
     *
     * @param light объект ПОЛУЧАТЕЛЯ запроса
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * Метод execute вызывает метод off() объекта-получателя
     * (то есть осветительной системы).
     */
    public void execute() {
        light.off();
    }
}
