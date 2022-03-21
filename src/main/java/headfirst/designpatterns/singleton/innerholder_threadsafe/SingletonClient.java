package headfirst.designpatterns.singleton.innerholder_threadsafe;

import java.util.concurrent.TimeUnit;

/**
 * При запуске этого приложения, видим, что объект создается один раз,
 * а потом его используют все.
 */
public class SingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.printf("%d - %s <%s>%n", i, singleton.getDescription(), singleton);
        }

        Thread thread1 = new Thread(() -> {
            for (int i = 10; i < 20; i = i + 3) {
                Singleton singleton = Singleton.getInstance();
                try {
                    TimeUnit.MILLISECONDS.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("%s: %d - %s <%s>%n", Thread.currentThread().getName(),
                        i, singleton.getDescription(), singleton);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 20; i < 30; i = i + 2) {
                Singleton singleton = Singleton.getInstance();
                try {
                    TimeUnit.MILLISECONDS.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("%s: %d - %s <%s>%n", Thread.currentThread().getName(),
                        i, singleton.getDescription(), singleton);
            }
        });

        thread2.start();
    }
}
