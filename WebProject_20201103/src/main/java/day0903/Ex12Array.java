package day0903;

import java.util.Scanner;

public class Ex12Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink", "Gray", "Black"};

        System.out.println(colors.length);

        String inputColor;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("input num:");
            inputColor = sc.nextLine();

            if (inputColor.charAt(0) == 'q' || inputColor.charAt(0) == 'Q') {
                break;
            }

            boolean find = false;
            for (int i = 0; i < colors.length; i++) {
                if (inputColor.equalsIgnoreCase(colors[i])) {
                    find = true;
                    System.out.println(i + 1 + "번쨰 잇다");
                    break;
                }
            }

            if (!find) {
                System.out.println(inputColor + " 는 없음.");
            }

            System.out.println();
        }

    }

}
