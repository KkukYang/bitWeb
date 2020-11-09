package day0902;

public class Ex22Gugudan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("** " + dan + " 단 **");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%3d X %d = %2d\n", dan, i, dan * i);
            }
            System.out.println();
        }


    }

}
