package day0907;

class MyMath {

    public static int abs(int n) {
        return (n < 0) ? n * -1 : n;
    }

    public static double abs(double n) {
        return (n < 0) ? n * -1 : n;
    }

    public static char toUpper(char c) {
        return c -= 32;
    }

    public static char toLower(char c) {
        return c += 32;
    }

    public static int pow(int n, int p) {
        int r = n;
        for (int i = 1; i < p; i++) {
            r *= n;
        }

        return r;
    }
}

public class Ex12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("** Math.abs() **");
        System.out.println(Math.abs(-9));
        System.out.println(Math.abs(8));
        System.out.println(Math.abs(-1.2));
        System.out.println(Math.abs(3.4));
        System.out.println(Math.abs(-2.3));
        System.out.println("** MyMath.abs() **");
        System.out.println(MyMath.abs(-9));
        System.out.println(MyMath.abs(8));
        System.out.println(MyMath.abs(-1.2));
        System.out.println(MyMath.abs(3.4));
        System.out.println(MyMath.abs(-2.3));

        System.out.println(MyMath.toLower('A'));
        System.out.println(MyMath.toUpper('a'));
        System.out.println(MyMath.pow(2, 4));
    }

}
