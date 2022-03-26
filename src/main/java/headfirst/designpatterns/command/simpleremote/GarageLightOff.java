package headfirst.designpatterns.command.simpleremote;

public class GarageLightOff implements Command{
    GarageDoor garageDoor;

    public GarageLightOff(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }
}
