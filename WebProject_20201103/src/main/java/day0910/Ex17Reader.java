package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17Reader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String msg = null;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("input string");
        try {
            msg = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }

}
