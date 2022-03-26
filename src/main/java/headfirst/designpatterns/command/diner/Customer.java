package headfirst.designpatterns.command.diner;

/**
 * Это КЛИЕНТ
 * Клиент отвечает за создание объекта команды,
 * содержащего набор операций с получателем.
 */
public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    /**
     * Создание объекта Команды
     *
     * @param order объект команды
     */
    public void createOrder(Order order) {
        this.order = order;
    }

    /**
     * Клиент вызывает метод setCommand()
     * (у нас это метод takeOrder(order)) Инициатора
     * и передает ему объект команды. Инициатор
     * сохраняет последний до момента использования.
     */
    public void hungry() {
        waitress.takeOrder(order);
    }
}