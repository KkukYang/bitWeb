package dayLecture.day0901;

import java.util.Scanner;

public class Ex8DataType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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

        System.out.printf("%30s\n\n", "**구입상품**");
        System.out.printf("%-30s\n\n", "**구입상품**");
        System.out.printf("name : %s\n", name);
        System.out.printf("cnt : %d\n", cnt);
        System.out.printf("price : %d\n", price);
        System.out.printf("total : %d\n", cnt * price);
    }

}
