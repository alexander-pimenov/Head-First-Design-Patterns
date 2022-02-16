package headfirst.designpatterns.strategy.challenge2;

/**
 * "Для реализации разных вариантов
 * поведения используется паттерн
 * Стратегия". Из этой фразы мы
 * узнаем, что поведение инкапсулируется
 * в отдельном наборе классов, который
 * легко расширяется и изменяется —
 * при необходимости даже во время
 * выполнения.
 */
public class PlayingField {
    public static void main(String[] args) {
        Character queen = new Queen("Santa-Mariya");
        Character king = new King("Richard");
        Character troll = new Troll("Gorick");
        Character knight = new Knight("Artur");
        Character cook = new Cook("Glasha");

        System.out.println("-=Представляем наших героев=-");
        queen.display();
        king.display();
        knight.display();
        troll.display();
        cook.display();

        System.out.println("-=Их способности боя=-");
        queen.fight();
//        queen.setWeapon(new SwordBehavior());
//        queen.fight();

        king.fight();
        troll.fight();
        knight.fight();
        cook.fight();

        System.out.println("-=Их СУПЕР способности боя=-");
        queen.superFight();
        king.superFight();
        troll.superFight();
        knight.superFight();
        cook.superFight();

        System.out.println("-=А так мы можем подменять им оружие=-");
        queen.display();
        queen.setWeapon(new AxeBehavior());
        queen.fight();

        king.display();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        troll.display();
        troll.setWeapon(new SwordBehavior());
        troll.fight();

        knight.display();
        knight.setWeapon(new PanBehavior());
        knight.fight();

        cook.display();
        cook.setWeapon(new KnifeBehavior());
        cook.fight();
    }
}
