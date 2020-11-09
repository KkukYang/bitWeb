package day0909;

interface AA {
    public void add(int a, int b);
}

interface BB {
    public void sub(int a, int b);
}

class Suhak implements AA, BB {

    @Override
    public void add(int a, int b) {
        // TODO Auto-generated method stub
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    @Override
    public void sub(int a, int b) {
        // TODO Auto-generated method stub
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

}

public class Ex07Interface {
    public static void main(String args[]) {
        System.out.println("Suhak 클래스로 선언한 경우.");
        Suhak s = new Suhak();
        s.add(3, 6);
        s.add(7, 3);
        System.out.println();

        System.out.println("AA 인터페이스로 선언한 경우.");
        AA a = new Suhak();
        a.add(10, 30);
        System.out.println();

        System.out.println("BB 인터페이스로 선언한 경우.");
        BB b = new Suhak();
        b.sub(6, 2);
    }
}
