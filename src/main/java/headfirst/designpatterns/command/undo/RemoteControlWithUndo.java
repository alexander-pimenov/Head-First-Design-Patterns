package headfirst.designpatterns.command.undo;

//
// This is the invoker
//
/**
 * Это реализация пульта.
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;

    /*Переменная для хранения последней выполненной команды.
    (для отслеживания последней команды).*/
    Command undoCommand;

    /**
     * В переменную undoCommand
     * изначально также заносится
     * объект NoCommand, чтобы
     * при нажатии кнопки отмены
     * ранее любых других кнопок
     * ничего не происходило.
     */
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * При нажатии кнопки мы
     * сначала читаем команду
     * и выполняем ее, а затем со-
     * храняем ссылку на нее в пере-
     * менной undoCommand.
     *
     * @param slot номер кнопки на пульте
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * При нажатии кнопки мы
     * сначала читаем команду
     * и выполняем ее, а затем со-
     * храняем ссылку на нее в пере-
     * менной undoCommand.
     * @param slot номер кнопки на пульте
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * При нажатии кнопки от-
     * мены мы вызываем ме-
     * тод undo() команды, хра-
     * нящейся в переменной
     * undoCommand. Вызов от-
     * меняет операцию последней
     * выполненной команды.
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
