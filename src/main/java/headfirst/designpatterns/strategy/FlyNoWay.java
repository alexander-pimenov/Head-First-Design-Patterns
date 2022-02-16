package headfirst.designpatterns.strategy;

public class FlyNoWay implements FlyBehavior {
	/**
	 * Реализация поведения для уток,
	 * которые НЕ ЛЕТАЮТ (например, резиновых).
	 */
	public void fly() {
		System.out.println("I can't fly");
	}
}
