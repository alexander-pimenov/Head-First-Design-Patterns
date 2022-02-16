package headfirst.designpatterns.strategy.challenge2;

/**
 * Character — абстрактный суперкласс для всех классов
 * персонажей (King, Queen, Knight и Troll).
 */
public abstract class Character {
    private WeaponBehavior weapon;
    private String name;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    /**
     * Чтобы сменить оружие, персонаж вызывает метод
     * setWeapon(), определяемый в суперклассе Character.
     *
     * @param weapon интерфейс оружие
     */
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    /**
     * Во время сражения для текущего оружия
     * персонажа вызывается метод useWeapon().
     */
    void fight() {
        weapon.useWeapon();
    }

    /**
     * Во время сражения для СУПЕР оружия
     * персонажа вызывается метод superFight().
     */
    void superFight() {
        weapon.superWeapon();
    }

    abstract void display();

    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }
}
