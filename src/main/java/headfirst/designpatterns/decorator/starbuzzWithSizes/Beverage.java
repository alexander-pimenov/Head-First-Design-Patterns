package headfirst.designpatterns.decorator.starbuzzWithSizes;

/**
 * Первый базовый класс.
 * Абстактный класс Компонента. Хотя можно использовать и интерфейс.
 * Здесь принципиально то, что Декораторы должны относиться к тому
 * же супертипу, что и декорируемые объекты (Компоненты). Таким образом,
 * наследование применяется для согласования типов, а не для обеспечения
 * поведения.
 * Пока код пишется для типа абстрактного компонента, использование
 * декораторов остается прозрачным для кода.
 * !!! Впрочем, если вы начинаете программировать на уровне конкретных
 * компонентов, вам стоит переосмыслить архитектуру приложения и
 * использования в нем декораторов.
 * <p>
 * Здесь еще ввели в меню разные размеры порций. Реализовали с помощью
 * enum.
 * <p>
 * Если в архитектуре участвуют декораторы, необходимо не только создать
 * компонент, но и «завернуть» его в сколькото декораторов.
 */
public abstract class Beverage {
    /**
     * Перечисление размеров кофе.
     */
    public enum Size {VENTI, TALL, GRANDE}

    //изначально инициализируем как TALL
    Size size = Size.TALL;

    //изначально инициализируем как "Unknown Beverage"
    String description = "Unknown Beverage";

    public String getDescription() {
        return description + " [size: " + getSize() + "] ";
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return "Beverage{" +
                "size=" + size +
                ", description='" + description + '\'' +
                '}';
    }
}
