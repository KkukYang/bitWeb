package day0902;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("input total val");
        int total = sc.nextInt();

        int _10000 = total / 10000;
        total %= 10000;

        int _5000 = total / 5000;
        total %= 5000;

        int _1000 = total / 1000;
        total %= 1000;

        int _500 = total / 500;
        total %= 500;

        int _100 = total / 100;
        total %= 100;

        int _50 = total / 50;
        total %= 50;

        int _10 = total / 10;
        total %= 10;

        int _5 = total / 5;
        total %= 5;

        int _1 = total / 1;
        total %= 1;

        System.out.printf("result \n");
        System.out.printf("10000:%d \n5000:%d \n1000:%d \n500:%d \n100:%d \n50:%d \n10:%d \n5:%d \n1:%d"
                , _10000, _5000, _1000, _500, _100, _50, _10, _5, _1);


    }

}
