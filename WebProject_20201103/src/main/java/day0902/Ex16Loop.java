package day0902;

public class Ex16Loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 1;
        while (true) {

            if (n > 20) {
                break;
            }

            n++;

            if (n % 2 == 1) {
                continue;
            }

            System.out.println(n);

        }
    }

}
