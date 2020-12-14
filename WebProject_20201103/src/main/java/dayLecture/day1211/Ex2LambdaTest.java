package dayLecture.day1211;

@FunctionalInterface
interface Apple2 {
    public int sum(int a, int b);
}

public class Ex2LambdaTest {
    public static void main(String[] args) {
        Apple2 a1 = new Apple2() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(a1.sum(5, 6));

        Apple2 a2 = (a, b) -> a + b;
        System.out.println(a2.sum(5, 7));

    }
}
