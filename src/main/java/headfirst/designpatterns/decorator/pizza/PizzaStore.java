package headfirst.designpatterns.decorator.pizza;

public class PizzaStore {

    public static void main(String args[]) {

        //сделаем пиццу на тонком теста и добавим сыр
        Pizza pizzaThin = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizzaThin);
        System.out.println(cheesePizza.getDescription()
                + " $" + String.format("%.2f", cheesePizza.cost()));

        //и добавим к этой пицце оливок
        Pizza greekPizza = new Olives(cheesePizza);
        System.out.println(greekPizza.getDescription()
                + " $" + String.format("%.2f", greekPizza.cost()));

        //сделаем новую пиццу на толстом тесте
        Pizza pizzaThick = new ThickcrustPizza();
        //добавим двойной сыр и двойные оливки
        pizzaThick = new Cheese(pizzaThick);
        pizzaThick = new Cheese(pizzaThick);
        pizzaThick = new Olives(pizzaThick);
        pizzaThick = new Olives(pizzaThick);
        System.out.println(pizzaThick.getDescription()
                + " $" + String.format("%.2f", pizzaThick.cost()));

        //приготовим еще одну вкусную пиццу на тонком тесте
        Pizza thinCrustPizza = new ThincrustPizza();
        thinCrustPizza = new Pepperoni(thinCrustPizza);
        thinCrustPizza = new SalamiSausage(thinCrustPizza);
        thinCrustPizza = new SalamiSausage(thinCrustPizza);
        thinCrustPizza = new Cheese(thinCrustPizza);
        thinCrustPizza = new Cheese(thinCrustPizza);
        thinCrustPizza = new Olives(thinCrustPizza);
        thinCrustPizza = new Olives(thinCrustPizza);
        System.out.println(thinCrustPizza.getDescription()
                + " $" + String.format("%.2f", thinCrustPizza.cost()));


    }
}
