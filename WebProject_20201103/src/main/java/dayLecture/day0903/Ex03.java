package dayLecture.day0903;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randNumber = r.nextInt(100) + 1;

        while (true) {
            System.out.println("input number:");
            int num = sc.nextInt();

            if (randNumber == num) {
                System.out.println("correct!");
                break;
            } else if (randNumber > num) {
                System.out.println("up");
            } else if (randNumber < num) {
                System.out.println("down");
            }
        }
        System.out.println("exit");
    }

}
