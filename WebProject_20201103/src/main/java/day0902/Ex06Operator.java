package day0902;

import java.util.Scanner;

public class Ex06Operator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int su1, su2, su3, max;

        su1 = sc.nextInt();
        su2 = sc.nextInt();
        su3 = sc.nextInt();

        max = su1 > su2 ? su1 : su2;
        max = su3 > max ? su3 : max;

        System.out.println(max);
    }

}
