package day0904;

import java.util.Scanner;

public class Ex04OX {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int[] jungdap = {1, 4, 2, 3, 1};
        int[] dap = new int[5];
        char[] ox = new char[5];
        int count = 0;

        System.out.println("input dap 5");
        for (int i = 0; i < dap.length; i++) {
            dap[i] = sc.nextInt();
        }

        System.out.println("정답 : ");
        for (int j : jungdap) {
            System.out.println(j + " ");
        }
        System.out.println();

        System.out.println("  답 : ");
        for (int d : dap) {
            System.out.println(d + " ");
        }
        System.out.println();

        //Scoring.
        for (int i = 0; i < ox.length; i++) {
            if (jungdap[i] == dap[i]) {
                ox[i] = 'O';
                count++;
            } else {
                ox[i] = 'X';
            }
        }

        System.out.println("채점 : ");
        for (char ch : ox) {
            System.out.println(ch + " ");
        }
        System.out.println();
        System.out.println("정답 : " + count + "개");
    }

}
