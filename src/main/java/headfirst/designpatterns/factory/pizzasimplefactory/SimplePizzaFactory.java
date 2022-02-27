package headfirst.designpatterns.factory.pizzasimplefactory;

/**
 * Единственная задача SimplePizzaFactory - создание объектов пиццы.
 * Фабрика инкапсулирует подробности создания объектов.
 * Каждый раз, когда комуто понадобится новая пицца, он просит фабрику
 * SimplePizzaFactory ее создать.
 * Класс SimplePizzaFactory занимается исключительно
 * созданием пиццы для своих клиентов.
 * Таким образом, создание объекта инкапсулируется в одном классе,
 * и будущие изменения реализации придется вносить только в одном месте.
 *
 * Говорят, что в фабрике можно создать createPizza в виде статического
 * метода.
 * Зачем фабрики оформляются в виде статических методов? Чтобы метод create
 * можно было вызывать и без создания экземпляра объекта. С другой стороны,
 * теряется возможность субклассирования и изменения поведения метода create.
 *
 * Фабрика должна быть единственной частью приложения, работающей
 * с конкретными классами пиццы...
 */
public class SimplePizzaFactory {

    /**
     * Метод createPizza(), который будет использоваться всеми
     * клиентами для создания новых объектов.
     * @param type название пиццы
     * @return объект пиццы
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
//if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }
