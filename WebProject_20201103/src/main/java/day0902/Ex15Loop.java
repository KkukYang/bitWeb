package day0902;

public class Ex15Loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 0;

        while (true) {
            System.out.println(++n);
            if (n == 5) {
                break;
            }
        }

        int a = 65;
        while (true) {
            System.out.println((char) a++);
            if (a > 90) {
                break;
            }
        }
    }

}
