package day0901;

public class Ex7DataType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //정수의 종류 네가지.
        //크기에 따라 byte 1 /short 2 /long 8/ int 4

        byte a = 127;
        byte b = (byte) 200; // -128 ~ 127

        float af = 0.123332323f;
        double bf = 0.123123123;

        char ac = 'd';
        String bs = "asdf";

        int ai = 100;

        System.out.printf("%d %f %c %s \n", ai, bf, ac, bs);
        System.out.printf("%10.1f %10.2f %10.3f\n", bf, af, bf);
    }

}
