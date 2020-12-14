package dayLecture.day0902;

public class Ex24 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(j + 1);
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 5 - i - 1; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
