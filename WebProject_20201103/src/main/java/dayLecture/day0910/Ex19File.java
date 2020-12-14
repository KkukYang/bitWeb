package dayLecture.day0910;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex19File {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr = null;
        BufferedReader br = null;

        try {
            String fileName = "student.txt";
            String packagePath = Ex18FileReader.class.getResource("").getPath();

            fr = new FileReader(packagePath + fileName);
            br = new BufferedReader(fr);

            System.out.println("** 파일 읽기 **");
            System.out.println("이름\t혈액형\tjava\thtml\t합계\t평균");
            System.out.println("--------------------------------------------");
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arrStr = line.split(",");
                int sum = Integer.parseInt(arrStr[2]) + Integer.parseInt(arrStr[3]);
                double average = (double) sum / 2.0;
                System.out.println(String.format("%s\t%s\t%s\t%s\t%s\t%s"
                        , arrStr[0], arrStr[1], arrStr[2], arrStr[3],
                        sum, average));
            }
            System.out.println("--------------------------------------------");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end");

    }

}
