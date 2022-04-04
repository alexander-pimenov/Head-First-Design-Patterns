package headfirst.designpatterns.command.remote;

/**
 * Все команды RemoteControl реализуют интерфейс
 * команды, состоящий из единственного метода execute().
 * Команды инкапсулируют набор операций с классом устройства.
 * Пульт активизирует эти операции вызовом метода execute().
 */
public interface Command {
	public void execute();
}
