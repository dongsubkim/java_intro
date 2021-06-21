package Part_3;

import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);
        do {
            value = scan.nextInt();
            System.out.println("Input:" + value);
        } while (value != 10);
        System.out.println("Loop finihsed.1");
    }
}
