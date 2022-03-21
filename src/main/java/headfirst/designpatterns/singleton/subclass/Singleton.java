package headfirst.designpatterns.singleton.subclass;

/**
 * Т.к. здесь рассматриваем уже не закрытый конструктор,
 * а защищенный, то это уже сможет запретить через new
 * объект этого класса.
 */
public class Singleton {
	protected static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	protected Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
