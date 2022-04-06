package headfirst.designpatterns.command.party;

/**
 * Класс разновидности команды, которая может
 * выполнять другие команды... причем
 * сразу несколько!
 * Макрокоманды позволяют динамически выбирать наборы команд,
 * включаемые в PartyCommand, и обладают большей гибкостью.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        //Берем массив команд и сохраняем
        //их в объекте MacroCommand.
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            //При выполнении макрокоманды все эти
            //команды будут последовательно выполнены.
            commands[i].execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure
     * proper undo functionality
     * ВНИМАНИЕ: эти команды должны выполняться в обратном порядке, чтобы обеспечить
     * надлежащую функциональность отмены
     */
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}

