package headfirst.designpatterns.factory.pizzafabricmethod;

/**
 * Фабрика по производству пиццы в нью-йоркском и чикагском стилях,
 * это определяется путем ввода данных в параметре метода.
 */
public class DependentPizzaStore {

    /**
     * Фабричный метод отвечает за создание объектов и
     * инкапсулирует эту операцию в субклассе.
     *
     * @param style стиль пиццы
     * @param type  тип пиццы
     * @return объект пиццы
     */
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza createPizza(Style style, Type type) {
        Pizza pizza = null;
        if (style.equals(Style.NY)) {
            if (type.equals(Type.CHEESE)) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals(Type.VEGGIE)) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals(Type.CLAM)) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals(Type.PEPPERONI)) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals(Style.CHICAGO)) {
            if (type.equals(Type.CHEESE)) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals(Type.VEGGIE)) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals(Type.CLAM)) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals(Type.PEPPERONI)) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else if (style.equals(Style.CALIFORNIA)) {
            if (type.equals(Type.CHEESE)) {
                pizza = new CaliforniaStyleCheesePizza();
            } else if (type.equals(Type.VEGGIE)) {
                pizza = new CaliforniaStyleCheesePizza();
            } else if (type.equals(Type.CLAM)) {
                pizza = new CaliforniaStyleClamPizza();
            } else if (type.equals(Type.PEPPERONI)) {
                pizza = new CaliforniaStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
