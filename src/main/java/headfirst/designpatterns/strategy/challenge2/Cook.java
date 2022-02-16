package headfirst.designpatterns.strategy.challenge2;

public class Cook extends Character{

    public Cook(String name) {
        super(name);
        this.setWeapon(new PanBehavior());
    }

    @Override
    void display() {
        System.out.println("I'm real Royal Cook ["+ getName()+"]  !!!");
    }
}
