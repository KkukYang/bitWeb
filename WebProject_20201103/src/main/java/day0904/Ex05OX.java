package day0904;

import java.util.Scanner;

public class Ex05OX {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String jungdap = "12134";
        String dap;

        char[] ox = new char[5];
        int count = 0;

        System.out.println("input 5 answers");
        dap = sc.nextLine();

        if (dap.indexOf(32) >= 0) {
            System.out.println("공백 x");
            return;
        }

        if (dap.length() != 5) {
            System.out.println("정답 5개만 입력 ");
            return;
        }

        for (int i = 0; i < dap.length(); i++) {
            char d = dap.charAt(i);
            char jd = jungdap.charAt(i);
            if (d == jd) {
                ox[i] = 'O';
                count++;
            } else {
                ox[i] = 'X';
            }
        }

        System.out.println("정답 : " + jungdap);
        System.out.println(" 답 : " + dap);

        //char[] 을 String 변환. 
        String strox = String.valueOf(ox);
        System.out.println("채점 : " + strox);
        System.out.println("정답 : " + count + "개");

        System.out.println("exit");

    }

}
