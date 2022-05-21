package headfirst.designpatterns.templatemethod.barista;

/**
 * Клиенты зависят от абстрактции CaffeineBeverage/CaffeineBeverageWithHook,
 * а не от конкретных классов Tea или Coffee;
 * это способствует сокращению зависимостей в системе.
 */
public class BeverageTestDrive {
	public static void main(String[] args) {
		//Создаем чай.
		CaffeineBeverage tea = new Tea();
		//Создаем кофе
		CaffeineBeverage coffee = new Coffee();

		/*Вызываем prepareRecipe() для обоих!*/
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 		//Создаем чай.
		CaffeineBeverageWithHook teaHook = new TeaWithHook();
		//Создаем кофе
		CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

		/*Вызываем prepareRecipe() для обоих!*/
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
