package headfirst.designpatterns.adapter.ducks;

/**
 * Новый обитатель птичника - индюшка.
 * Индюшки не крякают (у них нет метода quack())...
 * ...но могут летать, хотя и недалеко.
 */
public interface Turkey {
    public void gobble();

    public void fly();
}
