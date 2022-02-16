package headfirst.designpatterns.strategy.challenge2;

public class Knight extends Character {

    public Knight(String name) {
        super(name);
        this.setWeapon(new BowAndArrowBehavior());
    }

    @Override
    void display() {
        System.out.println("I'm honest and brave Knight [" + getName() + "]  !!!");
    }
}
