package dayLecture.day0910;

import java.io.IOException;
import java.io.InputStream;

public class Ex16Stream {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        InputStream in = System.in;
        System.out.println("문자열 입력 후 ctrl+z");
        while (true) {
            int n = in.read();
            if (n == -1) {
                break;
            }
            System.out.println((char) n);
        }
        System.out.println();
        System.out.println("end");
    }

}
