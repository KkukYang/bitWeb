package yangStudy;

@FunctionalInterface
interface MyNumber {
    int getMax(int num1, int num2);
//    int getMin(int num1, int num2);
}

public class Lambda_2 {

    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 30));
    }
}
