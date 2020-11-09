package day0909;

import java.util.Scanner;

public class Ex17Exception {

    public static void dataAdd() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int su1, su2;
        System.out.println("input su1 : ");
        su1 = Integer.parseInt(sc.nextLine());
        System.out.println("input su2 : ");
        su2 = Integer.parseInt(sc.nextLine());
        System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            dataAdd();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("문자섞임 : " + e.getMessage());
        }

        System.out.println("end");
    }

}
