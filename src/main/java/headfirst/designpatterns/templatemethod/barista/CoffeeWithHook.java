package headfirst.designpatterns.templatemethod.barista;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * Здесь вы переопределяете перехватчик и задаете нужную
     * функциональность.
     *
     * @return true or false
     */
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Предлагаем пользователю принять решение и возвра-
     * щаем true или false в зависимости от полученных данных.
     * В этом фрагменте мы спрашиваем пользователя, нужно ли
     * добавить в напиток сахар/молоко. Входные данные читаются
     * из командной строки.
     *
     * @return true or false
     */
    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
