package Part_4;

public class Array2DExam {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][1] = 10;

        int[][] array2 = new int[3][];
        array2[0] = new int[1];
        array2[1] = new int[2];
        array2[2] = new int[3];
        array2[0][0] = 10;

        int[][] array3 = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
        System.out.println(array3[0][0]);
        System.out.println(array3[2][2]);
    }
}
