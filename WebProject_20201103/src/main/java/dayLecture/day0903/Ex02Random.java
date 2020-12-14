package dayLecture.day0903;

import java.util.Random;

public class Ex02Random {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            System.out.println(r.nextInt(10));
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(r.nextInt(100));
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(r.nextInt(10) + 1);
        }


    }

}
