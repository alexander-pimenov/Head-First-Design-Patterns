package headfirst.designpatterns.singleton.enumS;

/**
 * С помощью enum создается самый верный потокобезопасный Singleton.
 */
public enum Singleton {
    UNIQUE_INSTANCE;

    // other useful fields here

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
