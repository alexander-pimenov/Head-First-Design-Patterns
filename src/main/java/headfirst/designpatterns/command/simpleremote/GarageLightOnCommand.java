package headfirst.designpatterns.command.simpleremote;

public class GarageLightOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }
}
