package headfirst.designpatterns.command.diner;

/**
 * Это ПОЛУЧАТЕЛЬ
 * Повар-получатель располагает всей информацией,
 * необходимой для приготовления блюд.
 * Повар — тот объект, который умеет выполнять заказы.
 */
public class Cook {

	public Cook() {}

	public void makeBurger() {
		System.out.println("Making a burger");
	}

	public void makeFries() {
		System.out.println("Making fries");
	}
}