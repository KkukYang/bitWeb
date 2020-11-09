package day0901;

import java.util.Scanner;

public class Ex4Scanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int year = 0;
        double dou1, dou2;

        System.out.println("input int:");
        year = sc.nextInt();

        System.out.println("input double1:");
        dou1 = sc.nextDouble();

        System.out.println("input double2:");
        dou2 = sc.nextDouble();

        System.out.println(year);
        System.out.println(dou1);
        System.out.println(dou2);
    }

}
