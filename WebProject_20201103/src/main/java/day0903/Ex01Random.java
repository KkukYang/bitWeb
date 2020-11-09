package day0903;

public class Ex01Random {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 5; i++) {
            System.out.println(Math.random());
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println((int) (Math.random() * 10));
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println((int) (Math.random() * 100));
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println((int) (Math.random() * 10) + 1);
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%c\n", 65 + (char) (Math.random() * ((90 - 65) + 1)));
        }
        // Min + (int)(Math.random() * ((Max - Min) + 1))

        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%c\n", 97 + (char) (Math.random() * ((97 - 122) + 1)));
        }

    }

}
