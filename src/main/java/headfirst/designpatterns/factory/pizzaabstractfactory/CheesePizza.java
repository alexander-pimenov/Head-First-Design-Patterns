package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * В ходе приготовления пиццы нам понадобится фабрика,
 * поставляющая ингредиенты - ingredientFactory.
 * Соответственно, конструктору каждого класса
 * пиццы передается объект фабрики, ссылка на который
 * сохраняется в переменной экземпляра.
 * <p>
 * Абстрактная Фабрика основана на композиции: создание объектов реализуется
 * в методе, доступ к которому осуществляется через интерфейс фабрики.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * Метод prepare() готовит пиццу с сыром. Когда ему требуется
     * очередной ингредиент, он запрашивает его у фабрики - ingredientFactory.
     * <p>
     * Класс Pizza может использовать любую фабрику ингредиентов - ingredientFactory.
     * В переменной экземпляра sauce сохраняется ссылка на
     * конкретный соус данной пиццы. Метод createSauce() возвращает
     * соус, используемый в данном регионе. Скажем, для Нью-Йорка это будет
     * соус «маринара».
     */
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
