package dayLecture.day0902;

public class Ex21Gugudan {
    public static void main(String args[]) {

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("** " + dan + " 단 **");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%3d X %d = %2d\n", dan, i, dan * i);
            }
            System.out.println();
        }
    }
}
