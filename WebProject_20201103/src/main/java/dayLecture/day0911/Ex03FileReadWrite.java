package dayLecture.day0911;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03FileReadWrite {

    List<Shop> list;
    Scanner sc;
    static final String FILENAME = "/Users/yang-mac/eclipse-workspace/JavaStudyYang/src/day0911/shop"; // 상수.

    public Ex03FileReadWrite() {
        list = new ArrayList<Shop>();
        sc = new Scanner(System.in);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] s = line.split(",");
                Shop shop = new Shop();
                shop.setSang(s[0]);
                shop.setColor(s[1]);
                shop.setCnt(Integer.parseInt(s[2]));
                shop.setPrice(Integer.parseInt(s[3]));
                list.add(shop);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void dataAdd() {
        System.out.println("add shop data");
        System.out.println("name :");
        String sang = sc.nextLine();
        System.out.println("color :");
        String color = sc.nextLine();
        System.out.println("count :");
        int cnt = Integer.parseInt(sc.nextLine());
        System.out.println("price :");
        int price = Integer.parseInt(sc.nextLine());

        Shop shop = new Shop(sang, color, cnt, price);
        list.add(shop);
        System.out.println("Added");
    }

    public void dataDel() {
        String search;
        boolean find = false;
        System.out.println("input name for delete:");
        search = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Shop s = list.get(i);
            if (s.getSang().equals(search)) {
                find = true;
                list.remove(i);
                break;
            }
        }

        if (find) {
            System.out.println(search + " was deleted.");
        } else {
            System.out.println(search + " is not exist.");
        }
        System.out.println();
    }

    public void dataAllWrite() {
        System.out.println("** dataAllWrite **");
        System.out.println();
        System.out.println("번호\t상품명\t색상\t갯수\t가격\t총금액");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        for (int i = 0; i < list.size(); i++) {
            Shop s = list.get(i);
            System.out.println(i + 1 + "\t" + s.getSang() + "\t" + s.getColor() + "\t" + s.getCnt() + "개\t"
                    + s.getPrice() + "\t" + nf.format(s.getCnt() * s.getPrice()));
        }
        System.out.println();
    }

    public void fileSave() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME);
            for (Shop s : list) {
                String str = s.getSang() + "," + s.getColor() + "," + s.getCnt() + "," + s.getPrice();
                fw.write(str + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getMenu() {
        int n;
        System.out.println("***menu***");
        System.out.println("1.dataAdd\n2.dataDel\n3.dataAllWrite\n4.exit");
        System.out.println("choose one");
        n = Integer.parseInt(sc.nextLine());
        return n;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex03FileReadWrite ex = new Ex03FileReadWrite();

        Exit:
        while (true) {
            switch (ex.getMenu()) {
                case 1:
                    ex.dataAdd();
                    break;
                case 2:
                    ex.dataDel();
                    break;
                case 3:
                    ex.dataAllWrite();
                    break;
                default:
                    ex.fileSave();
                    System.out.println("exit after file save.");
                    break Exit;
            }
        }
    }

}
