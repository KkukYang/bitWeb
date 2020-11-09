package yangStudy;

interface math_test {
    int max(int a, int b);
}

interface Compare {
    public int compareTo(int a, int b);
}

public class Lambda_1 {

    public static void exec(Compare com) {
        int k = 10;
        int m = 20;
        int value = com.compareTo(k, m);
        System.out.println(value);
    }


    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
//        int[] arr = new int[5];
//        Arrays.setAll(arr, (i) -> (int) (Math.random() * 5) + 1);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        System.out.println();
////////////////////////////////////////////////////////////////////////////////

        exec((i, j) -> {
            return i + j;
        });


    }


}
