package headfirst.designpatterns.strategy.challenge2;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Удар топором! Хрясь!!!");
    }

    @Override
    public void superWeapon() {
        System.out.println("Удар СУПЕР топором! Ну, очень острым! Хрясь!!! Трясь!!!");
    }
}
