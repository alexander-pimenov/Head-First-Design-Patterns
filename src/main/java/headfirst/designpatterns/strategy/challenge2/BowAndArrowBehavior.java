package headfirst.designpatterns.strategy.challenge2;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Стреляю из лука! Сссссчик!!!");
    }

    @Override
    public void superWeapon() {
        System.out.println("Стреляю из СУПЕР лука! Летит стрела-молния! Шшшиииц!!!");
    }
}
