package dayLecture.day0902;

public class Ex20MultiLoop {
    public static void main(String args[]) {
        Loop1:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 3) {
                    break Loop1;
                }
            }
        }

        System.out.println();


        Loop2:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue Loop2;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println();
    }
}
