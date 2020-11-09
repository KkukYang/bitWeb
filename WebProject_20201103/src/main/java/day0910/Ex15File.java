package day0910;

import java.io.File;

public class Ex15File {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String path = "/Users/yang-mac/Desktop/java0901/";
        File file1 = new File(path + "memo.text");
        File file2 = new File(path + "ppt");
        File file3 = new File(path + "hello.text");

        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file2.isFile());
        System.out.println(file1.length());//byte

        System.out.println(file1.exists());
        System.out.println(file3.exists());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.canExecute());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());

        System.out.println("if ppt were Directory, print list");
        if (file2.isDirectory()) {
            String[] list = file2.list();
            for (String a : list) {
                System.out.println(a);
            }
        }

        System.out.println("delete");
        if (file1.exists()) {
            file1.delete();
            System.out.println("file1 was deleted.");
        } else {
            System.out.println("file1 is not existe");
        }

        if (file3.exists()) {
            file1.delete();
            System.out.println("file3 was deleted.");
        } else {
            System.out.println("file3 is not existe");
        }

    }

}
