package dayLecture.day0903;

import java.util.Scanner;

public class Ex13Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int[] person = new int[10];
        int[] cnt = new int[5];

        for (int i = 0; i < person.length; i++) {
            System.out.printf("input person age: %d\n", i);
            person[i] = sc.nextInt();

            if (person[i] / 10 >= 1 && person[i] / 10 <= 5) {
                cnt[person[i] / 10 - 1]++;

            }
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.println((i + 1) * 10 + "대 :" + cnt[i]);
        }

    }

}
