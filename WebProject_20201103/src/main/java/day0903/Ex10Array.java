package day0903;

public class Ex10Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] data = {4, 6, 1, 12, 99, 123, -100, 900, 5, 11};
        System.out.println("total cnt : " + data.length);

        int pcnt = 0, mcnt = 0;

        for (int i : data) {
            if (i >= 0) {
                pcnt++;
            } else {
                mcnt++;
            }
        }
        System.out.println("pcnt:" + pcnt);
        System.out.println("mcnt:" + mcnt);
    }

}
