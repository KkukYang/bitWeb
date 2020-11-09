package day0903;

import java.util.Scanner;

public class Ex14Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String msg;
        int[] alpha = new int[26];

        System.out.println("input English sentence");
        msg = sc.nextLine();
        msg = msg.replace(" ", "");

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.toUpperCase().charAt(i);
            alpha[ch - 65]++;
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%c = %d\n", i + 65, alpha[i]);
        }
    }

}
