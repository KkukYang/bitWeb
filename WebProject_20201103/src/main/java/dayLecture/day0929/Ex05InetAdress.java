package dayLecture.day0929;

import java.net.InetAddress;

public class Ex05InetAdress {

    public static void main(String[] args) {
        InetAddress[] naverInet = null;
        InetAddress[] googleInet = null;
        try {
            naverInet = InetAddress.getAllByName("http://naver.com");
            System.out.println("naver");
            for (InetAddress in : naverInet) {
                System.out.println("naver host name : " + in.getHostName());
                System.out.println("naver host ip : " + in.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            googleInet = InetAddress.getAllByName("http://google.com");
            System.out.println("google");
            for (InetAddress in : googleInet) {
                System.out.println("google host name : " + in.getHostName());
                System.out.println("google host ip : " + in.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
