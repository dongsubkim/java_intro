package Part_3;

public class LogicalOpsExam {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println(b2 || b2);

        int score = 88;
        if (score <= 100 && score >= 70) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        System.out.println(!b1);
    }
}
