package Part_3;

public class IfExam {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;
        // if (x < y) {
        // System.out.println("x is smaller than y.");
        // System.out.println("In block");
        // }

        // if (x < y)
        // System.out.println("x is smaller than y.");
        // System.out.println("No block");

        if (x == y) {
            System.out.println("x is equal to y");
        } else if (x < y) {
            System.out.println("x is smaller than y.");
        } else {
            System.out.println("x is not equal to y.");
        }
    }
}
