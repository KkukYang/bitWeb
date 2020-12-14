package dayLecture.day1211;

@FunctionalInterface // 1개만 가능.
interface Apple1{
    public void write();
//    public void show();
}

public class Ex1LambdaTest {
    public static void main(String[] args) {
        Apple1 a1 = new Apple1() {
            @Override
            public void write() {
                System.out.println("write by a1");
            }
        };

        a1.write();

        Apple1 a2 = ()-> System.out.println("write by a2");
        a2.write();

        Apple1 a3 = () -> {
            System.out.println("write by a3 - 1");
            System.out.println("write by a3 - 2");
            System.out.println("write by a3 - 3");
        };
        a3.write();


    }
}
