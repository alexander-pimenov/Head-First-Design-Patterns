package headfirst.designpatterns.iterator.dinermerger;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    /**
     * Объект MenuItem содержит несколько полей: имя, описание, флаг
     * вегетарианского блюда и цена. Все эти значения передаются конструктору
     * для инициализации объекта MenuItem.
     *
     * @param name        название блюда
     * @param description описание блюда
     * @param vegetarian  флаг вегетарианства
     * @param price       цена блюда
     */
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
