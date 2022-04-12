package headfirst.designpatterns.adapter.ducks.challenge;

import headfirst.designpatterns.adapter.ducks.Duck;

/**
 * Прежде всего необходимо реализовать интерфейс того типа,
 * на который рассчитан ваш клиент.
 * <p>
 * Адаптер реализует целевой интерфейс и хранит ссылку
 * на экземпляр адаптируемого объекта.
 */
public class DroneAdapter implements Duck {
    //Адаптируемый объект
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    public void quack() {
        drone.beep();
    }

    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }
}
