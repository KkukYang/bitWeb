package day0910;

import java.io.*;

public class Ex18FileReader {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        FileReader fr = null;
        BufferedReader br = null;

        try {
//	    fr = new FileReader("/Users/yang-mac/eclipse-workspace/JavaStudyYang/src/day0910/Untitled 1");
//	    File file1 = new File("/Users/yang-mac/eclipse-workspace/JavaStudyYang/src/day0910/Untitled 1");
            String fileName = "Untitled 1";
            String packagePath = Ex18FileReader.class.getResource("").getPath();

            System.out.println("packagePath : " + packagePath);

            File file1 = new File("./src/day0910/Untitled 1");
            System.out.println(file1.getCanonicalPath());
            System.out.println(file1.getAbsolutePath());
//	    fr = new FileReader(file1.getCanonicalPath());
            fr = new FileReader(packagePath + fileName);
            br = new BufferedReader(fr);

            int count = 0;
            int sum = 0;

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
                sum += Integer.parseInt(line.trim());
                count++;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
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
