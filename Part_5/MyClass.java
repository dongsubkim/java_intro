package Part_5;

public class MyClass {
    public void method1() {
        System.out.println("method1 executed.");
    }

    public void method2(int x) {
        System.out.println("method2 using x: " + x);
    }

    public int method3() {
        System.out.println("method3 executed.");
        return 10;
    }

    public void method4(int x, int y) {
        System.out.println(x + y + "method4 executed.");
    }

    public int method5(int y) {
        System.out.println("method 5 with y:" + y);
        return y * 2;
    }
}
