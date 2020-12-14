package dayLecture.day0901;

import java.util.Scanner;

public class Ex5Scanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();    //enter key를 따로 읽어서 다음줄에 영향이 없도록한다.

        sc.nextLine();

        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);
    }

}
