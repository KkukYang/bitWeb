package dayLecture.day0922;

interface InterA {    //final 상수와 추상메서드만 존재. abstract를 붙이지 않음.
    public void draw();

    public void close();

    public final int aa = 123;

}

class Apple {
    public void show() {
        System.out.println("show() in Apple class.");
    }
}

class Orange extends Apple implements InterA {
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("draw() in Orange class.");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("close() in Orange class.");
    }
}

public class Ex02Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Orange ex1 = new Orange();
        ex1.draw();
        ex1.close();
        ex1.show();
        System.out.println();

        Apple ex2 = new Orange();
        ex2.show();
        System.out.println();

        InterA ex3 = new Orange();
        ex3.draw();
        ex3.close();


    }

}
