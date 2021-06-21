package Part_6;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("firetruck");
        Car c3 = new Car("ambulance", 1111);

        System.out.println(c2.name);
    }
}
