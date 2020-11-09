package day0902;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int score, count = 0, sum = 0;
        double avg = 0;

        while (true) {
            System.out.println("input:");
            score = sc.nextInt();

            if (score == 0) {
                break;
            }

            try {
                sum += score;
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        avg = (double) sum / count;
        System.out.println(String.format("average: %.2f", avg));
    }

}
