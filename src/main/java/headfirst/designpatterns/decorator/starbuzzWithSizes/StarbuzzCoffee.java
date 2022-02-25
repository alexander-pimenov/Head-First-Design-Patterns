package headfirst.designpatterns.decorator.starbuzzWithSizes;

import headfirst.designpatterns.decorator.starbuzzWithSizes.Beverage.Size;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + String.format("%.2f", beverage3.cost()));

        //Еще раз заказ, как сам захотел:
        Beverage beverage4 = new DarkRoast();
        beverage4.setSize(Size.GRANDE);
        System.out.println(beverage4.getDescription()
                + " $" + String.format("%.2f", beverage4.cost()));
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + String.format("%.2f", beverage4.cost()));
        beverage4 = new Mocha(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + String.format("%.2f", beverage4.cost()));
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + String.format("%.2f", beverage4.cost()));

        //Еще раз тот же заказ, но через билдеры:
        Beverage beverage5 = new DarkRoast();
        beverage5.setSize(Size.GRANDE);
        beverage5 = Whip.builder()
                .beverage(Mocha.builder()
                        .beverage(Soy.builder()
                                .beverage(beverage5)
                                .build())
                        .build())
                .build();
        System.out.println(beverage5.getDescription()
                + " $" + String.format("%.2f", beverage5.cost()));

        System.out.println(new Soy(beverage5));
    }
}
