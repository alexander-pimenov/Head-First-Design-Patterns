package headfirst.designpatterns.command.remote;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    /**
     * По аналогии с LightOnCommand передается экзепляр
     * стереосистемы, который сохраняется в локальной
     * переменной экземпляра.
     *
     * @param stereo объект получателя команды Stereo
     */
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    /**
     * Для выполнения этого запроса необходимо вызвать три
     * операции со стереосистемой: включить ее, установить
     * режим воспроизведения CD и установить громкость на
     * уровне 11.
     */
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
