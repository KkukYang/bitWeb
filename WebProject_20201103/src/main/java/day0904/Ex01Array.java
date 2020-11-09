package day0904;

import java.util.Scanner;

public class Ex01Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String[] names = {"이영자", "강호동", "홍길동", "강호남", "이영미", "임영웅", "장민호", "마이클", "캐서린", "캔디", "안소니", "마이선"};

        while (true) {
            int count = 0;
            boolean find = false;
            String search;
            System.out.println("input lastName");
            search = sc.nextLine();
            if (search.equals("end") || search.equalsIgnoreCase("q")) {
                System.out.println("exit");
            }
            for (int i = 0; i < names.length; i++) {
                if (names[i].startsWith(search)) {
                    System.out.println(i + ":" + names[i]);
                    find = true;
                    count++;
                }
            }

            if (find) {
                System.out.println("total" + count + "were found");
            } else {
                System.out.println("not found");
            }
            System.out.println();
        }
    }

}
