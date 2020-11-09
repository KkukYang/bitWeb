package day0902;

public class Ex18Loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 0;
        for (; a <= 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

}
