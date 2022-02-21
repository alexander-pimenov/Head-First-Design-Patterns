package headfirst.designpatterns.decorator.starbuzz;

public class StarbuzzCoffee {

    public static void main(String args[]) {

        //Заказываем эспрессо без дополнений, выводим описание и
        // стоимость.
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        //Создаем объект DarkRoast.
        Beverage beverage2 = new DarkRoast();
        //«Заворачиваем» в объект Mocha (добавляем шоколад)...
        beverage2 = new Mocha(beverage2);
        //...Потом во второй Mocha...
        beverage2 = new Mocha(beverage2);
        //... И еще в объект Whip (добавляем взбитых сливок).
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        //И еще заказываем «домашнюю смесь» с соей, шоколадом и взбитыми сливками.
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

        //Еще раз заказа как сам хотел
        Beverage beverage4 = new DarkRoast();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Milk(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + beverage4.cost());


        //Это для примера создавал объект абстрактного класса
        Beverage beverage1 = new Beverage() {
            @Override
            public double cost() {
                return 100;
            }
        };
        System.out.println(beverage1);
    }
}
