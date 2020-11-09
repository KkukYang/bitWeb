package day0902;

import java.util.Scanner;

public class Ex10Switch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        char alpha;
        alpha = sc.nextLine().charAt(0);

        switch (alpha) {
            case 'A':
            case 'a':
                System.out.println("Apple");
                break;

            case 'B':
            case 'b':
                System.out.println("Banana");
                break;

            default:
                break;
        }
    }

}
