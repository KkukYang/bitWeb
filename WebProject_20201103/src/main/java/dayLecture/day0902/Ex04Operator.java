package dayLecture.day0902;

public class Ex04Operator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //++ --
        int m, n;
        int a, b;

        m = n = 6;
        a = b = 5;
        a += m++ - --b;
        System.out.printf("%d,%d,%d\n", a, b, m);
    }

}
