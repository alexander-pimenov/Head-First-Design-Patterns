package headfirst.designpatterns.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

/**
 * Для тех, кто еще не знаком с JFrame, поясняем: это основной контейнер Swing,
 * наследующий метод paint(). По умолчанию paint() не делает ничего, потому
 * что является перехватчиком! Переопределяя paint(), можно подключиться к ал-
 * горитму, используемому JFrame для перерисовки своей части экрана, и вклю-
 * чить в JFrame свой графический вывод.
 * <p>
 * Расширяем класс JFrame, который содержит метод update(), управляющий перерисовкой
 * экрана. Чтобы подключиться к этому алгоритму, мы переопределяем метод paint().
 */
public class MyFrame extends JFrame {
    private static final long serialVersionUID = 2L;

    /**
     * Подробности несущественны!
     * Просто некая инициализация...
     *
     * @param title заголовок
     */
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    /**
     * Алгоритм перерисовки JFrame вызывает paint(). По умолчанию
     * метод paint() не делает ничего... это перехватчик.
     * Переопределенная в ерсия paint() выводит сообщение в окне.
     *
     * @param graphics graphics
     */
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
