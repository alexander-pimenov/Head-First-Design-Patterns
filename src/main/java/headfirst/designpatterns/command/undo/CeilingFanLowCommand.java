package headfirst.designpatterns.command.undo;

public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;

    /*Добавляем локальную переменную состояния для хранения предыдущей скорости.*/
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    /**
     * В методе execute перед изменением скорости ее предыдущее
     * значение сохраняется для возможной отмены.
     */
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    /**
     * В методе undo() вентилятор возвращается к предыдущей скорости.
     */
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
