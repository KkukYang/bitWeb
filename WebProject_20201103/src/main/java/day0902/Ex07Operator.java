package day0902;

import java.util.Scanner;

public class Ex07Operator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int score;
        char grade;

        score = sc.nextInt();

        grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : ((score > 70) ? 'C' : ((score > 60) ? 'D' : 'F')));

        System.out.println(grade);

//	System.out.println(String.format("", args));
    }

}
