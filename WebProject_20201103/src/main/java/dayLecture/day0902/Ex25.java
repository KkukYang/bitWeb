package dayLecture.day0902;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);


        int val = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= val; i++) {
            sum += i;
        }

        System.out.println("result : " + sum);
    }

}
