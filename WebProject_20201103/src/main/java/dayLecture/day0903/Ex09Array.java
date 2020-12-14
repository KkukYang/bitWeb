package dayLecture.day0903;

public class Ex09Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] data = {4, 6, 1, 12, 99, 123, -100, 900, 5, 11};

        int max = data[0];
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
            if (min > data[i]) {
                min = data[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
