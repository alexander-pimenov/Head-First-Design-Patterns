package headfirst.designpatterns.strategy.challenge2;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Удар ножом! Шик!!!");
    }

    @Override
    public void superWeapon() {
        System.out.println("Удар СУПЕР ножом! Шик-Пик!!!");
    }
}
