package Part_6;

public class Car {
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        // this.name = "no name";
        // this.number = 0;
        this("no name", 0);
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
