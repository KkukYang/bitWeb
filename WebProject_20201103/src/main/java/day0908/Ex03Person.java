package day0908;

import java.util.Scanner;

public class Ex03Person {

    Person[] per;
    static Scanner sc;
    int inwon;

    public void dataAdd() {
        System.out.println("input inwon");
        inwon = Integer.parseInt(sc.nextLine());
        per = new Person[inwon];

        for (int i = 0; i < inwon; i++) {
            System.out.println("input name");
            String name = sc.nextLine();
            System.out.println("input year");
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("input height");
            double height = Double.parseDouble(sc.nextLine());
            System.out.println("input weight");
            double weight = Double.parseDouble(sc.nextLine());

            Person p = new Person(name, year, height, weight);
            per[i] = p;

            System.out.println("Added.");
        }
    }

    public void dataWrite() {
        System.out.println("번호\t이름\t년도\t띠\t키\t몸무게\t평가");

        for (int i = 0; i < per.length; i++) {
            Person p = per[i];
            System.out.println(i + 1 + "\t" + p.getName() + "\t"
                    + p.getYear() + "\t" + p.getddi() + "\t" + p.getHeight()
                    + "\t" + p.getWeight() + "\t" + p.getPungga());
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        sc = new Scanner(System.in);
        Ex03Person ep = new Ex03Person();
        ep.dataAdd();
        ep.dataWrite();

    }

}
