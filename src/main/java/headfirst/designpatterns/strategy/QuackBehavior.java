package headfirst.designpatterns.strategy;

/**
 * QuackBehavior - интерфейс для классов, реализующих поведение
 * кряканья.
 * Класс, представляющий поведение, выглядит немного
 * странно. Разве классы не должны представлять сущности?
 * И разве классы не должны обладать состоянием И поведением?
 * Действительно, в ОО-системах классы представляют сущ-
 * ности, которые обычно обладают как состоянием (переменными
 * экземпляров), так и методами. И в данном случае сущностью
 * оказывается поведение. Однако даже поведение может обла-
 * дать состоянием и методами; скажем, поведение полета может
 * использовать переменные экземпляров, представляющие атри-
 * буты полета (количество взмахов крыльев в минуту, максималь-
 * ная высота и скорость и т. д.).
 * Поведение утки уже рассматривается не как
 * совокупность аспектов поведения, а как семейство алгоритмов.
 */
public interface QuackBehavior {
    public void quack();
}
