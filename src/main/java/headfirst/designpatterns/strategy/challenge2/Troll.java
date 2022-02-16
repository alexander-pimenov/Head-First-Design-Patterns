package headfirst.designpatterns.strategy.challenge2;

public class Troll extends Character {

    public Troll(String name) {
        super(name);
        this.setWeapon(new AxeBehavior());
    }

    @Override
    void display() {
        System.out.println("I'm strong and ugly Troll [" + getName() + "]  !!!");
    }
}
