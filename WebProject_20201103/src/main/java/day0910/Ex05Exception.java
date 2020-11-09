package day0910;

public class Ex05Exception {
    public static void main(String args[]) {
        System.out.println("hi see you 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
