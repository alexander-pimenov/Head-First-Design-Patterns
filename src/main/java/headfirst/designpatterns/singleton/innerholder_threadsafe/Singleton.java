package headfirst.designpatterns.singleton.innerholder_threadsafe;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton with innerHolder!";
    }

    public static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }
}
