package dayLecture.day0908;

import java.util.StringTokenizer;

public class Ex08Token {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String msg = "red,green,blue,gray,white,yellow";
        StringTokenizer st = new StringTokenizer(msg, ",");
        int count = st.countTokens();
        System.out.println(count);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();
        String[] data = msg.split(",");
        System.out.println(data.length);
        for (String d : data) {
            System.out.println(d);
        }
    }

}
