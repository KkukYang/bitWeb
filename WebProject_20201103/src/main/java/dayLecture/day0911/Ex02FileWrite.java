package dayLecture.day0911;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02FileWrite {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String name, hp;
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/yang-mac/eclipse-workspace/JavaStudyYang/src/day0911/info", true);
            while (true) {
                System.out.println("input name :");
                name = sc.nextLine();
                if (name.equals("end")) {
                    break;
                }
                fw.write("name : " + name + "\n");
                System.out.println("input hp :");
                hp = sc.nextLine();
                fw.write("hp :" + hp + "\n");
                fw.write("===========\n");
            }
            System.out.println("check info file.");
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
