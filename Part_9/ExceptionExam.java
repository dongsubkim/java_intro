package Part_9;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            // throw new ArithmeticException();
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e.toString());
        } finally {
            System.out.println("Finally end of try-catch");
        }

        System.out.println("main end.");
    }
}
