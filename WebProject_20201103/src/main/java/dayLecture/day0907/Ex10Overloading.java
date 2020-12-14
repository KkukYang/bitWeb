package dayLecture.day0907;

public class Ex10Overloading {
    public static void write(int n) {
        System.out.println(n);
    }

    public static void write(int n, int m) {
        System.out.println(n + m);
    }

    public static void write(String name) {
        System.out.println("My name is " + name);
    }

    public static void write(String name, int age) {
        System.out.println(name + "의 나이는 " + age + "세 입니다.");
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void sum(String a, String b) {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        write(20);
        write(3, 5);
        write("미자");
        write("영자", 23);

        sum(3, 5);
        sum(1, 2, 3);
        sum(1.9, 2.3);
        sum("apple", "orange");
    }

}
