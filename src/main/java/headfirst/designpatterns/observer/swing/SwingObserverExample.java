package headfirst.designpatterns.observer.swing;

import java.awt.*;
import javax.swing.*;

/**
 * Рассмотрим простую часть Swing API — JButton. Заглянув во внутрен-
 * нюю реализацию суперкласса JButton, AbstractButton, вы найдете в ней
 * многочисленные методы добавления/удаления наблюдателей (слушате-
 * лей в терминологии Swing). Эти методы позволяют добавлять и удалять
 * слушателей и прослушивать различные типы событий, происходящих
 * с компонентом Swing. Например, ActionListener позволяет прослуши-
 * вать различные типы действий, выполняемых с кнопками (например,
 * нажатий). Разные типы слушателей часто встречаются в Swing API.
 * <p>
 * Приложение довольно простое: при нажатии кнопки с вопросом слуша-
 * тели (наблюдатели) могут ответить на вопрос так, как считают нужным.
 * Мы реализовали двух таких наблюдателей: AngelListener и DevilListener.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    /**
     * Метод для демонстрации работы приложения.
     * Все, что от вас потребуется — создать объект JButton, разместить
     * его на компоненте JFrame и настроить слушателей. Для реализации
     * слушателей будут использоваться внутренние классы (стандартный прием
     * в Swing программировании) или лямбды.
     */
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        /*Назначаем объекты слушателями (наблюдателями) событий кнопки.*/
        // Without lambdas
        //button.addActionListener(new AngelListener());
        //button.addActionListener(new DevilListener());

        // With lambdas
        /*Мы заменили объекты AngelListener и DevilListener лямбда-выражениями,
         которые реализуют ту же функцио нальность, что и прежде.
         Когда пользователь щелкает на кнопке, объекты функций, созданные
         лямбда-выражениями, получают оповещения об этом событии, после чего
         выполняется реализуемый ими метод. Лямбда-выражения делают этот
         код намного более компактным.*/
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
                System.out.println("Come on, do it!")
        );

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties - код подготовки фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
	
	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	 * Определения наблюдателей в виде внутренних классов (хотя возможны
	 * и другие способы - реализация анонимных классов или люмбды:
	 * при использовании лямбда-выражений вместо внутреннего класса вы
	 * просто пропускаете этап создания объекта ActionListener. С
	 * лямбда-выражением вы вместо этого создаете объект функции, который
	 * и является наблюдателем.).
	 * При изменении состояния субъекта (в данном случае кнопки) вместо update()
	 * вызывается метод actionPerformed().
	 * 
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
