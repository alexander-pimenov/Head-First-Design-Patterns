package headfirst.designpatterns.singleton.classic;

public class SingletonClient {
    public static void main(String[] args) {
        //Запустим и увидим, что метод вызывает только один и тот же объект.
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription() + " <" + singleton + ">");
        for (int i = 0; i < 5; i++) {
            Singleton.getInstance();
            System.out.println(i + ": " + singleton.getDescription() + " <" + singleton + ">");
        }
    }
}
