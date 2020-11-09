package day0929;

public class Ex01ThreadTest extends Thread {
    String msg;
    int num;

    public Ex01ThreadTest(String msg, int num) {
        this.msg = msg;
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i + ":" + msg);
        }
    }

    public static void main(String[] args) {
        Ex01ThreadTest ex1 = new Ex01ThreadTest("one", 200);
        Ex01ThreadTest ex2 = new Ex01ThreadTest("two", 200);
        Ex01ThreadTest ex3 = new Ex01ThreadTest("three", 200);
        ex1.start();
        ex2.start();
        ex3.start();
    }
}
