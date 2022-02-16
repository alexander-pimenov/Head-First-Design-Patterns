package headfirst.designpatterns.strategy.challenge2;

public class Queen extends Character {

    public Queen(String name) {
        super(name);
        this.setWeapon(new KnifeBehavior());
    }

    @Override
    void display() {
//        System.out.println("I'm real super-puper Queen [" + getName() + "]  !!!");
        System.out.println("I'm real super-puper " + getSimpleName() + " [" + getName() + "]  !!!");
    }
}
