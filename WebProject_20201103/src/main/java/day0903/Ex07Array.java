package day0903;

public class Ex07Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] str = {"apple", "orange", "banana"};
        double[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(str.length);
        System.out.println(num.length);

        for (String s : str) {
            System.out.println(s);
        }

        System.out.println();
        for (double n : num) {
            System.out.println(n);
        }

    }

}
