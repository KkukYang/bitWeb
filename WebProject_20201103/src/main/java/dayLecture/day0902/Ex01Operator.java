package dayLecture.day0902;

import java.util.Scanner;

public class Ex01Operator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int su1, su2;

        su1 = sc.nextInt();
        su2 = sc.nextInt();

        System.out.printf("%20s\n\n", "result");
        System.out.printf("%d+%d=%d\n", su1, su2, su1 + su2);
        System.out.printf("%d-%d=%d\n", su1, su2, su1 - su2);
        System.out.printf("%d*%d=%d\n", su1, su2, su1 * su2);
        System.out.printf("%d/%d=%.2f\n", su1, su2, (double) su1 / su2);
        System.out.printf("%d%%%d=%d\n", su1, su2, su1 % su2);

    }

}
