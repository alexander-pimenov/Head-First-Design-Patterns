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
public class Coffee {

    /**
     * Рецепт приготовления кофе взят прямо из учебного пособия.
     * Каждый шаг реализован в виде отдельного метода.
     */
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /*Каждый из этих методов реализует один шаг алгоритма:
	кипячение воды, настаивание кофе, разливание по чашкам, добавление сахара и молока.*/

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
