package Part_8;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeVolume(20);
        tv.changeChannel(10);
        tv.turnOff();
    }
}
