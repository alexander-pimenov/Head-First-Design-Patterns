package headfirst.designpatterns.observer.weather;

/**
 * Определяем интерфейс, реализуемый всеми
 * визуальными элементами (Наблюдателями).
 * Каждый элемент должен
 * реализовать метод display()
 */
public interface DisplayElement {
	/**
	 * Интерф ейс DisplayElement со-
	 * держит всего один метод display(),
	 * который вызывается для отобра-
	 * жения визуального элемента.
	 */
	public void display();
}
