package Part_8;

public class LedTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("turn on led tv");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off led tv");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("change volumne of led tv");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("change channel of led tv");
    }
}
