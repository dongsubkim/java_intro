package Part_8;

public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();

    public void turnOff();

    public void changeVolume(int volume);

    public ovid changeChannel(int channel);
}
