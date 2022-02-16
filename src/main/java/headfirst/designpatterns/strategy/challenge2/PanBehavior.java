package headfirst.designpatterns.strategy.challenge2;

public class PanBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Удар сковородкой! Бамц!!!");
    }

    @Override
    public void superWeapon() {
        System.out.println("Удар СУПЕР половником! Бамц-Бамц!!!");
    }
}
