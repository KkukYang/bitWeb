package dayLecture.day0910;

import java.io.FileWriter;
import java.io.IOException;

public class Ex04Exception {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileWriter fw = null;
        String fileName = "/Users/yang-mac/Desktop/java0901/memo.txt";
        try {
            fw = new FileWriter(fileName);
            fw.write("saved");    //contents
            System.out.println("checked");

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
