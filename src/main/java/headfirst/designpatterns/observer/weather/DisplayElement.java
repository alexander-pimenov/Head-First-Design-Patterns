package headfirst.designpatterns.observer.weather;

/**
 * Определяем интерфейс, реализуемый всеми
 * визуальными элементами (Наблюдателями).
 * Каждый элемент должен
 * реализовать метод display()
 */
public interface DisplayElement {
	public void display();
}
