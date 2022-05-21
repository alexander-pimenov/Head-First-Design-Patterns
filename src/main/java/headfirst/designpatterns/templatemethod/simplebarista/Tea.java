package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * Классы Coffee и Tea содержат дублирующийся код.
 * Дублирование кода — верный признак того, что в архитектуру необходимо вносить
 * изменения. Раз чай и кофе так похожи, стоит выделить
 * их сходные аспекты в базовый класс.
 * <p>
 * Алгоритм определяется классами
 * Coffee и Tea.
 * Частичное дублирование кода
 * в классах Coffee и Tea.
 * Модификация алгоритма требует
 * открытия субклассов и внесения
 * множественных изменений.
 * Добавление новых классов в такой
 * структуре требует значительной
 * работы.
 * Знание алгоритма и его реализации
 * распределено по многим классам.
 */
public class Tea {
    /**
     * Реализация очень похожа на реализацию Coffee; шаги 2 и 4
     * различаются, но рецепт почти не изменился.
     */
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    /*Каждый из этих методов реализует один шаг алгоритма:
	кипячение воды, настаивание кофе, разливание по чашкам, добавление сахара и молока.*/

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
