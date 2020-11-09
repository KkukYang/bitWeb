package day0911;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex01FileWrite {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/yang-mac/eclipse-workspace/JavaStudyYang/src/day0911/test1", true);
            fw.write("Hello\n안녕하세요\n" + new Date().toString() + "\n=====");
            System.out.println("check the file.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
