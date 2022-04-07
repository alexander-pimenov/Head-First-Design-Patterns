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
public class CeilingFanOffCommand implements Command {
	//Получатель
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH: 	ceilingFan.high(); break;
			case CeilingFan.MEDIUM: ceilingFan.medium(); break;
			case CeilingFan.LOW: 	ceilingFan.low(); break;
			default: 				ceilingFan.off(); break;
		}
	}
}
