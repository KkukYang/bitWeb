package day0901;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String name = "";
        int cnt = 0;
        int price = 0;

        System.out.println("품목명:");
        name = sc.nextLine();

        System.out.println("수량:");
        cnt = Integer.parseInt(sc.nextLine());

        System.out.println("가격:");
        price = Integer.parseInt(sc.nextLine());

        System.out.println("총 가격은 " + cnt * price + "입니다.");
    }

}
