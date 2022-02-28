package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * Фабрика ингредиентов для Нью-Йорка.
 * Нью-Йоркская фабрика ингредиентов реализует общий
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
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    //Для каждого ингредиента в семействе создается его версия для Нью-Йорка.

    /**
     * Метод определяет тип основы для пиццы.
     *
     * @return объект основы для пиццы
     */
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /**
     * Метод определяет тип морепродуктов для пиццы.
     *
     * @return объект морепродукты для пиццы
     */
    public Clams createClam() {
        return new FreshClams();
    }
}
