package headfirst.designpatterns.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    private static final long serialVersionUID = 2L;
    String message;

    /**
     * Перехватчик init позволяет выполнить
     * необходимые действия при инициализации
     * приложения.
     * repaint() — конкретный метод класса Applet,
     * при помощи которого компоненты высокого
     * уровня оповещаются о необходимости
     * перерисовки аплета.
     */
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    /**
     * Перехватчик start позволяет
     * приложению выполнить необходимые
     * действия непосредственно перед
     * отображением аплета на веб-
     * странице.
     */
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    /**
     * При переходе к другой странице
     * перехватчик stop дает приложе-
     * нию возможность сд елать все не-
     * обходимое для завершения работы.
     */
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    /**
     * Перехватчик destroy используется перед
     * уничтожением приложения (например,
     * при закрытии браузера). Здесь можно
     * что-нибудь вывести, но какой смысл?
     */
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }

    /**
     * Посмотрите-ка сюда! Наш
     * старый знакомый — метод paint()!
     * Аплет тоже использует его как
     * перехватчика.
     *
     * @param g Graphics
     */
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

