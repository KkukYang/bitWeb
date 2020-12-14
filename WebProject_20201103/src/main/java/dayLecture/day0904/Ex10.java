package dayLecture.day0904;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int inputMoney = 0;

        while (true) {
            System.out.println("금액 입력 : ");
            inputMoney = sc.nextInt();

            if (inputMoney < 1000) {
                System.out.println("금액이 부족합니다. 종료합니다.");
                return;
            } else {
                break;
            }
        }

        int[] num = new int[6];
        for (int cnt = 0; cnt < inputMoney / 1000; cnt++) {
            Loop:
            for (int i = 0; i < num.length; i++) {
                num[i] = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if (num[i] == num[j]) {
                        i--;
                        continue Loop;
                    }
                }
            }

            for (int i = 0; i < num.length - 1; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] > num[j]) {
                        int temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }

            System.out.print((cnt + 1) + " : ");
            for (int n : num) {
                System.out.printf("%3d", n);
            }

            System.out.println();

        }

    }

}
