package headfirst.designpatterns.command.undo;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;

    /*Класс CeilingFan имеет локальную переменную состояния,
    представляющую скорость вращения вентилятора.*/
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    /**
     * Метод, задающий скорость вращения вентилятора.
     */
    public void high() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    /**
     * Метод, задающий скорость вращения вентилятора.
     */
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    /**
     * Метод, задающий скорость вращения вентилятора.
     */
    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    /**
     * Метод, задающий Выключение вентилятора.
     */
    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    /**
     * Для получения текущей скорости используется метод
     * getSpeed().
     *
     * @return числовой эквивалент скорости вентилятора
     */
    public int getSpeed() {
        return speed;
    }
}
