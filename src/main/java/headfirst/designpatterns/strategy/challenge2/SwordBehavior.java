package headfirst.designpatterns.strategy.challenge2;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Удар мечом! Бах!!!");
    }

    @Override
    public void superWeapon() {
        System.out.println("Удар СУПЕР мечом! Трах-Бах!!!");
    }
}
