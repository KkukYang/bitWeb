package day0929;

public class Ex02RunnableTest implements Runnable {
    String msg;
    int num;

    public Ex02RunnableTest(String msg, int num) {
        this.msg = msg;
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + ":" + msg);
        }
    }

    public static void main(String[] args) {
        Ex02RunnableTest ex1 = new Ex02RunnableTest("one", 200);
        Ex02RunnableTest ex2 = new Ex02RunnableTest("two", 200);
        Ex02RunnableTest ex3 = new Ex02RunnableTest("three", 200);

        Thread th1 = new Thread(ex1);
        Thread th2 = new Thread(ex2);
        Thread th3 = new Thread(ex3);

        th1.start();
        th2.start();
        th3.start();

    }
}
