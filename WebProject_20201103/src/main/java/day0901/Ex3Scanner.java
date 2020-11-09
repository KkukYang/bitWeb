package day0901;

import java.util.Scanner;

public class Ex3Scanner {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("input : ");
        String name = sc.nextLine();    //띄워쓰기 포함한 한줄.

        System.out.println(name);

        System.out.println("input:");
        String name2 = sc.next();    //한단어만.

        System.out.println(name2);

    }

}
