package day0902;

public class Ex19MultiLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 1; i < 3; i++) {
            System.out.println("hello");

            for (int j = 1; j <= 4; j++) {
                System.out.println("\tKitty");
            }
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println("i = " + i + ",j = " + j);
            }
        }
    }

}
