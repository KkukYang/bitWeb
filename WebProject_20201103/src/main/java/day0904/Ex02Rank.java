package day0904;

public class Ex02Rank {
    public static void main(String args[]) {
        int[] score = {56, 78, 34, 56, 90};
        int[] rank = new int[5];

        for (int i = 0; i < score.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    rank[i]++;
                }
            }
        }
        System.out.println("번호 \t점수 \t등수");

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + 1 + "\t" + score[i] + "\t" + rank[i]);
        }

    }
}
