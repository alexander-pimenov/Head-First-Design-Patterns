package headfirst.designpatterns.strategy.challenge2;

public class King extends Character {

    public King(String name) {
        super(name);
        this.setWeapon(new SwordBehavior());
    }


    @Override
    void display() {
//        System.out.println("I'm real King ["+ getName()+"]  !!!");
        System.out.println("I'm real " + getSimpleName() + " [" + getName() + "]  !!!");
    }


}
