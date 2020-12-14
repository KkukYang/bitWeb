package dayLecture.day0902;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();

        String result = ((kor + eng + mat) / 3.0 >= 60.0 && (kor >= 40) && (eng >= 40) && (mat >= 40)) ? "pass" : "fail";

        System.out.println(result);
    }

}
