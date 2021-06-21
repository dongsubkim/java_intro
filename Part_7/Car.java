package Part_7;

public class Car {
    public void run() {
        System.out.println("car run");
    }

    public Car(String name) {
        System.out.println("Car constructor");
    }

    public Car() {
        this("");
    }
}
