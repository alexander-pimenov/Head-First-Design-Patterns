package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * Фабрика ингредиентов для Чикаго.
 * Чикагская фабрика ингредиентов реализует общий
 * интерфейс всех фабрик ингредиентов.
 * <p>
 * На основе Абстрактной Фабрики создаются одна или несколько
 * конкретных фабрик, производящих одинаковые продукты, но с разными
 * реализациями.
 * <p>
 * Конкретные фабрики реализуют разные семейства продуктов. Чтобы
 * создать продукт, клиент использует одну из фабрик, т.е. ему
 * никогда не приходится явно создавать экземпляры продуктов
 * (потому что фабрика это делает).
 * <p>
 * Задача конкретных фабрик — создавать ингредиенты для пиццы.
 * Каждая фабрика умеет создавать правильные объекты для
 * своего региона.
 * <p>
 * Каждая фабрика предоставляет свою реализацию для семейства
 * продуктов. Т.е. каждый конкретный субкласс создает семейство продуктов.
 */
public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{
                new BlackOlives(),
                new Spinach(),
                new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
