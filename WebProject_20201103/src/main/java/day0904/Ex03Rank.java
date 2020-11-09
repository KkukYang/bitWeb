package day0904;

import java.util.Scanner;

public class Ex03Rank {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int cnt;
        String[] name;
        int[] java, jsp;
        int[] rank;
        int[] tot;

        System.out.println("input people cnt");
        cnt = sc.nextInt();
        name = new String[cnt];
        java = new int[cnt];
        jsp = new int[cnt];
        rank = new int[cnt];
        tot = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            System.out.printf("input %d java score : \n", i);
            java[i] = sc.nextInt();
            sc.nextLine();
            System.out.printf("input %d jsp score : \n", i);
            jsp[i] = sc.nextInt();

            tot[i] = java[i] + jsp[i];
        }

        for (int i = 0; i < tot.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < tot.length; j++) {
                if (tot[i] < tot[j]) {
                    rank[i]++;
                }
            }
        }

        System.out.println("번호 \t점수 \t등수");

        for (int i = 0; i < tot.length; i++) {
            System.out.println(i + 1 + "\t" + tot[i] + "\t" + rank[i]);
        }

    }

}
