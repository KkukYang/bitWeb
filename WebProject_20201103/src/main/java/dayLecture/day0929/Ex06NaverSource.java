package dayLecture.day0929;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex06NaverSource {
    public static void main(String[] args) {
        String hostName = "https://www.naver.com";
        URL url = null;

        try {
            url = new URL(hostName);
            InputStream is = url.openStream();
            BufferedReader br = null;
            br = new BufferedReader(new InputStreamReader(is));
            int n = 0;

            while (true) {
                n++;
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(n + ":" + line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
