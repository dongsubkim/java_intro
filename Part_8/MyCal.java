package Part_8;

public class MyCal implements Calculator {

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }
}
