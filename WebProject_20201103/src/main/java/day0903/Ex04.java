package day0903;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ran = r.nextInt();
        int su, cnt = 0;

        Exit:
        while (true) {

            System.out.println("input num:");
            su = sc.nextInt();

            if (su > ran) {
                System.out.println("down");
            } else if (su < ran) {
                System.out.println("up");
            } else {
                System.out.println("correct");
                System.out.println("continu? y/n");
                sc.nextLine();

                char ans = sc.nextLine().charAt(0);

                if (ans != 'y' && ans != 'Y') {
                    break Exit;
                } else {
                    continue Exit;
                }

            }
        }

    }

}
