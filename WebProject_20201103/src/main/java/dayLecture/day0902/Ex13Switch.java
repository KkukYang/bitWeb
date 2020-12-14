package dayLecture.day0902;

import java.util.Scanner;

public class Ex13Switch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String msg;

        msg = sc.nextLine();

        switch (msg) {
            case "game":
                System.out.println("game level up");
                break;

            case "shopping":
                System.out.println("add cart");
                break;

            case "exit":
                System.out.println("exit");
                break;

            default:
                System.out.println("what do you want");
        }
    }

}
