package headfirst.designpatterns.factory.pizzafabricmethod;
/**
 * Конкретный продукт — разные виды пиццы, производимые
 * в наших пиццериях.
 */
public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella and Gouda Cheese");
        toppings.add("Frozen Clams");
        toppings.add("Black Olives");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangular slices");
    }
}
