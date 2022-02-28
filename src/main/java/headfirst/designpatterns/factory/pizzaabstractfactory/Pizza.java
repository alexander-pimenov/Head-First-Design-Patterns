package headfirst.designpatterns.factory.pizzaabstractfactory;

/**
 * Код Pizza использует фабрику для производства ингредиентов, используемых в пиц-
 * це. Производимые ингредиенты определяются фабрикой. Для класса Pizza различия
 * несущественны; он умеет готовить пиццу из обобщенных ингредиентов. Он изоли-
 * рован от различий в региональных ингредиентах, и мы можем легко использовать
 * его с фабриками для любых других регионов.
 */
public abstract class Pizza {
    String name;

    //Каждый объект пиццы содержит набор ингредиентов, используемых
    // при ее приготовлении.
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * Метод prepare стал абстрактным.
     * В нем мы будем собирать ингредиенты, необходимые для приготовления
     * пиццы. Которые, разумеется, будут производиться фабрикой ингредиентов.
     */
    abstract void prepare();

    //Другие методы остаются неизменными (кроме prepare).
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
