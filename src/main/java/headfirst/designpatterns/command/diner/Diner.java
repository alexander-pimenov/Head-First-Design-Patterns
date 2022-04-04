package headfirst.designpatterns.command.diner;

/**
 * Клиент отвечает за создание
 * объекта команды, содержащего
 * набор операций с получателем.
 */
public class Diner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();

        /*Клиент вызывает метод setCommand() (здесь createOrder())
         Инициатора и передает ему объект команды. Инициатор сохраняет
         последний до момента использования.*/
        Customer customer = new Customer(waitress);
        customer.createOrder(new BurgerAndFriesOrder(cook));
        customer.hungry();
    }
}