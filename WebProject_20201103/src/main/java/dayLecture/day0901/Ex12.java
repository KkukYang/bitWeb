package dayLecture.day0901;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("input name");
        String name = sc.nextLine();

        System.out.println("input ko");
        double ko = Double.parseDouble(sc.nextLine());

        System.out.println("input eng");
        double eng = Double.parseDouble(sc.nextLine());

        System.out.println("input math");
        double math = Double.parseDouble(sc.nextLine());

        System.out.printf("name : %s\ntotal : %3.2f\naverage : %3.2f", name, (ko + eng + math), (ko + eng + math) / 3.0f);


    }

}
