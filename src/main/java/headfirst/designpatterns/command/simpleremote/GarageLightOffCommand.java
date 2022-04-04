package headfirst.designpatterns.command.simpleremote;

public class GarageLightOffCommand implements Command{
    GarageDoor garageDoor;

    public GarageLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }
}
