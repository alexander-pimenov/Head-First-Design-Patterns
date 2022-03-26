package headfirst.designpatterns.command.diner;

/**
 * Это ИНИЦИАТОР
 */
public class Waitress {
    Order order;

    public Waitress() {
    }

    /**
     * Клиент будет вызывает этот метод setCommand() (у нас
     * это метод takeOrder(order)) Инициатора и передает ему
     * объект команды. Для сохранения объекта Команды.
     * Инициатор сохраняет последний до момента использования.
     *
     * @param order объект КОМАНДЫ
     */
    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }
}