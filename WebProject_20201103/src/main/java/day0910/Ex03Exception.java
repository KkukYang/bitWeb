package day0910;

import java.util.Scanner;

public class Ex03Exception {
    public static void process() throws NumberFormatException, ArithmeticException {
        Scanner sc = new Scanner(System.in);

        int su1, su2;
        System.out.println("input 2 Num");
        su1 = Integer.parseInt(sc.nextLine());
        su2 = Integer.parseInt(sc.nextLine());

        int div = su1 / su2;
        System.out.printf("%d/%d = %d\n", su1, su2, div);

    }

    public static void main(String args[]) {
        try {
            process();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
