package Part_7;

public class BusExam3 {
    public static void main(String[] args) {
        Car c = new Bus();
        c.run();
        // c.horn();

        Bus bus = (Bus) c;
        bus.run();
        bus.horn();
    }
}
