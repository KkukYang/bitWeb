package dayLecture.day0907;

//import java.util.Random;

import java.util.Scanner;

public class Ex01Array2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
//	Random r = new Random();
//	int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        int[][] arr = new int[3][3];

        while (true) {
            // input
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
//		    arr[i][j] = 1 + r.nextInt(3);
                    arr[i][j] = (int) (Math.random() * 3) + 1; //1~3
                }
            }

            // output
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf(arr[i][j] + "\t");
                }
                System.out.println();
            }

            int binggo = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                    binggo++;
                }
                if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                    binggo++;
                }

            }
            if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                binggo++;
            }
            if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                binggo++;
            }

            if (binggo > 0) {
                System.out.println("빙고 " + binggo + "개");
            } else {
                System.out.println("none");
            }

            // exit
            System.out.println("input q/Q for exit");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("q")) {
                break;
            }
        }

    }

}
