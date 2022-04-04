package headfirst.designpatterns.command.diner;

/**
 * Класс команды должен реализовать интерфейс {@link Order}
 * (обычно дают название интерфейсу - Command).
 * Объект заказа инкапсулирует запрос на приготовление блюд
 * в методе orderUp().
 */
public class BurgerAndFriesOrder implements Order {
    //Объект Заказа содержит ссылку на объект, который
    //должен готовить блюда, на Повара
    Cook cook;

    public BurgerAndFriesOrder(Cook cook) {
        this.cook = cook;
    }

    /**
     * Аналог команды execute() в паттерне Команда
     * Объект команды содержит единственный метод
     * execute(), здесь это метод orderUp(), в
     * котором инкапсулируются операции с Получателем.
     */
    public void orderUp() {
        cook.makeBurger();
        cook.makeFries();
    }
}
