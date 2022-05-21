package headfirst.designpatterns.templatemethod.barista;

/**
 * CaffeineBeverageWithHook — компонент высокого уровня. Он определяет
 * алгоритм рецепта и обращается с вызовами к субклассам только
 * тогда, когда они необходимы для реализации метода.
 * Tea и Coffee никогда не обращаются с вызовами к абстрактному
 * классу — сначала он обращается к ним.
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * Шаблонный метод с методом перехватчиком.
     * Добавляем условную конструкцию, результат которой
     * определяется вызовом конкретного метода
     * customerWantsCondiments().
     * Только если вызов вернет true, мы
     * вызываем addCondiments().
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Этот Конкретный метод, который не делает ничего особенного!
     * Субклассы могут переопределять такие методы
     * (называемые «перехватчиками»), но не обязаны это делать.
     * «Перехватчиком» называется метод, объявленный абстрактным классом,
     * но имеющий пустую реализацию (или реализацию по умолчанию).
     * Он дает возможность субклассу «подключаться» к алгоритму в разных точках.
     * Впрочем, субкласс также может проигнорировать имеющийся перехватчик.
     * Метод с (почти) пустой реализацией по умолчанию:
     * просто возвращает true, и не делает ничего более.
     * Перехватчик: субкласс может переопределить этот метод,
     * но не обязан этого делать.
     *
     * @return true or false
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
