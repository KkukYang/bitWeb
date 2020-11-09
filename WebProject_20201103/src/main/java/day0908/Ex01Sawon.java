package day0908;

import day0907.Sawon;

import java.util.Scanner;

public class Ex01Sawon {

    Sawon[] sa;
    int inwon;
    Scanner sc;

    public Ex01Sawon() {
        super();
        // TODO Auto-generated constructor stub
        sc = new Scanner(System.in);
    }

    public void dataAdd() {
        System.out.println("인원수를 입력하세요.");
        inwon = Integer.parseInt(sc.nextLine());
        sa = new Sawon[inwon];
        for (int i = 0; i < inwon; i++) {
            System.out.println("input name");
            String name = sc.nextLine();
            System.out.println("input age");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("input blood");
            String blood = sc.nextLine();
            System.out.println("input pay");
            int pay = Integer.parseInt(sc.nextLine());
            System.out.println("input sudang");
            int sudang = Integer.parseInt(sc.nextLine());

            sa[i] = new Sawon(name, age, blood, pay, sudang);
            System.out.println();
        }
    }

    public void dataWrite() {
        System.out.println("번호\t이름\t나이\t혈액형\t급여\t수당\t총금액");
        for (int i = 0; i < inwon; i++) {
            System.out.println(i + 1 + "\t" + sa[i].getName() + "\t" + sa[i].getAge() + "\t" + sa[i].getBlood() + "\t"
                    + sa[i].getPay() + "\t" + sa[i].getSudang() + "\t" + sa[i].getTotal());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex01Sawon ex = new Ex01Sawon();
        ex.dataAdd();
        ex.dataWrite();
    }

}
