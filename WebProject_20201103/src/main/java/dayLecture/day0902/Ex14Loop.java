package dayLecture.day0902;

public class Ex14Loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 0;

        do {
            System.out.println("hello 2");
        } while (n > 10);

        n = 0;
        while (n <= 5) {
            System.out.println(++n);
        }

        n = 0;

        do {
            System.out.println(++n);
        } while (n <= 5);
    }

}
