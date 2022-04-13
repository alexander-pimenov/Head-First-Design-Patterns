package headfirst.designpatterns.facade.hometheater;

/**
 * Фасад — именно то, что нам нужно: мы берем сложную подсистему и для
 * упрощения работы с ней реализуем фасадный класс, который предо-
 * ставляет общий, более удобный интерфейс. Не беспокойтесь; вся мощь
 * сложной подсистемы остается в вашем распоряжении, но если вам ну-
 * жен только упрощенный интерфейс — пользуйтесь Фасадом.
 * Класс фасада рассматривает компоненты домашнего кинотеатра
 * как подсистему и обращается с вызовами к этой подсистеме для
 * реализации своего метода watchMovie().
 */
public class HomeTheaterFacade {
    /*Композиция: компоненты подсистемы, которые мы собираемся использовать.*/
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    /**
     * В конструкторе фасада передаются ссылки на все компоненты.
     * Фасад присваивает их соответствующим переменным экземпляра.
     *
     * @param amp       усилитель
     * @param tuner     тюнер
     * @param player    DVD player
     * @param projector проектор
     * @param screen    экран
     * @param lights    освещение
     * @param popper    поп-корн
     */
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {

        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    /**
     * Метод watchMovie() выполняет те же операции, которые ранее
     * выполнялись нами вручную. Обратите внимание: выполнение каждой операции
     * делегируется соответствующему компоненту подсистемы.
     *
     * @param movie название фильма
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        //Включить аппарат для попкорна,
        //начать готовить попкорн...
        popper.on();
        popper.pop();
        //Уменьшить яркость света до 10%...
        lights.dim(10);
        //Опустить экран...
        screen.down();
        //Включить проектор и выбрать широкоэкранный режим для кино...
        projector.on();
        projector.wideScreenMode();
        //Включить усилитель, связать с DVD...
        amp.on();
        amp.setStreamingPlayer(player);
        //включить режим окружающего звука и установить громкость 5...
        amp.setSurroundSound();
        amp.setVolume(5);
        //Включить DVD-проигрыватель...
        player.on();
        //посмотреть фильм
        player.play(movie);
    }

    /**
     * Метод endMovie() выключает всю аппаратуру за нас. И снова
     * каждая операция делегируется соответствующему компоненту
     * подсистемы.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
