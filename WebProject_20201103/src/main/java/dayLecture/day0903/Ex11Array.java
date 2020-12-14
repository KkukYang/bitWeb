package dayLecture.day0903;

import java.util.Scanner;

public class Ex11Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] data = {3, 7, 11, 1, 6, 8, 9, 15, 17, 20};
        System.out.println(data.length);

        int su;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("input num:");
            su = sc.nextInt();

            if (su == 0) {
                break;
            }

            boolean find = false;
            for (int i = 0; i < data.length; i++) {
                if (su == data[i]) {
                    find = true;
                    System.out.println(i + 1 + "번쨰 잇다");
                    break;
                }
            }

            if (!find) {
                System.out.println(su + "수는 없음.");
            }

            System.out.println();
        }

    }

}
