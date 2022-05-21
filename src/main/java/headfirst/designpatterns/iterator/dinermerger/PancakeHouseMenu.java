package headfirst.designpatterns.iterator.dinermerger;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация меню блинной от Ли.
 */
public class PancakeHouseMenu implements Menu {
    //Лу хранит элементы меню в ArrayList.
    List<MenuItem> menuItems;

    /**
     * Каждый элемент меню включается в ArrayList в конструкторе.
     * Для каждого объекта MenuItem задается имя, описание, признак
     * вегетарианского блюда и цена.
     */
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    /**
     * Чтобы добавить новый элемент меню, Лу создает новый объект
     * MenuItem, задает все необходимые аргументы и включает созданный
     * объ ект в ArrayList.
     *
     * @param name        название блюда
     * @param description описание блюда
     * @param vegetarian  признак вегетарианского блюда
     * @param price       цена
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * Метод getMenuItems() возвращает список элементов меню.
     *
     * @return список элементов меню
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString() {
        return "Objectville Pancake House Menu";
    }

    // other menu methods here
}
