package dayLecture.day0929;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex04LocalAddress {
    public static void main(String[] args) {
        InetAddress myAddr = null;
        try {
            myAddr = InetAddress.getLocalHost();
            System.out.println("name : " + myAddr.getHostName());
            System.out.println("ip : " + myAddr.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
