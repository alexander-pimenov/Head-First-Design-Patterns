package headfirst.designpatterns.facade.hometheater;

/**
 * Клиентский код теперь обращается с вызовами к фасадному
 * классу домашнего кинотеатра, а не к подсистеме. Т.е. всем
 * классам подсистемы в отдельности.
 * Таким образом, чтобы просмотреть фильм, мы вызываем всего
 * один метод — watchMovie(), — а тот берет на себя все
 * взаимодействие с освещением, DVD-проигрывателем, проектором,
 * усилителем, экраном и т. д.
 * <p>
 * В паттерне Фасад подсистема остается открытой для непосредственного
 * использования. Если вам понадобится расширенная функциональность
 * классов подсистемы — обращайтесь к ним напрямую.
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // Создание экземпляров компонентов
        // Компоненты создаются прямо в ходе тестирования.
        // Обычно клиент получает фасад, а не создает его.
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        //Сначала мы создаем фасад со всеми компонентами подсистемы.
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, player,
                        projector, screen, lights, popper);

        //Упрощенный интерфейс используется для запуска и для прекращения просмотра.
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
