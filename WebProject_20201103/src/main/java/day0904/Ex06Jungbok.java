package day0904;

public class Ex06Jungbok {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num = new int[10];
        Loop:
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 30) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    continue Loop;
                }
            }
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int n : num) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

}
