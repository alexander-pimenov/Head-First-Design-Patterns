package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * В ходе приготовления пиццы нам понадобится фабрика,
 * поставляющая ингредиенты - ingredientFactory.
 * Соответственно, конструктору каждого класса
 * пиццы передается объект фабрики, ссылка на который
 * сохраняется в переменной экземпляра.
 *
 * Абстрактная Фабрика основана на композиции: создание объектов реализуется
 * в методе, доступ к которому осуществляется через интерфейс фабрики.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
