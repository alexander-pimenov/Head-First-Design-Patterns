package headfirst.designpatterns.command.remote;

//
// This is the invoker - Иницатор
//

/**
 * Класс RemoteControl управляет набором
 * объектов команд (по одному на кнопку). При
 * нажатии кнопки вызывается соответствующий
 * метод ButtonWasPushed(), который
 * активизирует метод execute() объекта
 * команды. Класс пульта больше ничего не
 * знает о тех классах, к которым он обращается,
 * так как он отделен от них объектом команды.
 */
public class RemoteControl {
    /*В этой версии пульт будет поддерживать все семь команд «вкл/выкл»,
    которые будут храниться в соответствующих массивах.*/
    //кнопка ВКЛ
    Command[] onCommands;
    //кнопка ВЫКЛ
    Command[] offCommands;

    /**
     * Конструктор создает экземпляры команд и инициализирует
     * массивы onCommands и offCommands.
     * В конструкторе RemoteControl с каждой ячейкой связывается объ-
     * ект NoCommand по умолчанию, и мы знаем, что в каждой ячейке
     * всегда присутствует допустимая команда. Это сделано для того,
     * чтобы код пульта не проверял наличие команды на null при каждом
     * обращении к ячейке в методе onButtonWasPushed() и в методе offButtonWasPushed().
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * Метод setCommand() получает ячейку и команды включения/выключения
     * для этой ячейки. Команды сохраняются в массивах для последующего
     * использования.
     *
     * @param slot       ячейка
     * @param onCommand  команда включения
     * @param offCommand команда выключения
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /*При нажатии кнопки «вкл» или «выкл» пульт вызывает соответствующий метод:
    onButtonWasPushed() или offButtonWasPushed().*/
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
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
