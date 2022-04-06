package headfirst.designpatterns.command.remoteWL;

//
// This is the invoker
//
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    //поле для названия кнопки
    String[] name;

    /**
     * Обрати внимание, что в конструкторе больше не используем объект класса
     * {@link headfirst.designpatterns.command.remote.NoCommand}, а реализуем с помощью
     * лямбда-выражений "ничего не делание" !!! Они так же по аналогии с классом
     * NoCommand создают пустые объекты, которые ничего не делают.
     * Т.е. так можно избавиться от лишнего кода.
     * Вместо объекта NoCommand используем лямбда-выражение, которое не делает
     * ничего! (По аналогии с методом execute() в объекте  NoCommand, который тоже
     * ничего не делал.)
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        name = new String[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> {
            };
            offCommands[i] = () -> {
            };
            name[i] = "untitled";
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] "
                    + "(" + name[i] + ") "
                    + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

    public void setCommand(int slot, String slotName, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        name[slot] = slotName;
    }
}
