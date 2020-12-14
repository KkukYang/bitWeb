package dayLecture.day0910;

import dayLecture.day0908.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {
    Scanner sc;
    List<Person> list;

    public Ex13() {
        sc = new Scanner(System.in);
        list = new ArrayList<Person>();
    }

    public void dataAdd() {
        System.out.println("input name:");
        String name = sc.nextLine();
        System.out.println("input year:");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("input height:");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("input weight:");
        double weight = Double.parseDouble(sc.nextLine());

        Person p = new Person();
        p.setName(name);
        p.setYear(year);
        p.setHeight(height);
        p.setWeight(weight);
        list.add(p);
        System.out.println(list.size() + " added data.");
    }

    public void dataDel() {
        System.out.println("input name for delete:");
        String name = sc.nextLine();
        boolean find = false;
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if (p.getName().equals(name)) {
                find = true;
                list.remove(i);
                break;
            }
        }

        if (find) {
            System.out.println(name + " data was deleted.");
        } else {
            System.out.println(name + " data is not exist.");
        }

    }

    public void dataAllWrite() {
        System.out.println("\t\tPerson list");
        System.out.println();
        System.out.println("Name\tYear\tDDI\tHeight\tWeight\tPungga");
        for (Person p : list) {
            System.out.println(p.getName() + "\t" + p.getYear() + "\t" + p.getddi() + "\t" + p.getHeight() + "\t"
                    + p.getWeight() + "\t" + p.getPungga());
        }
    }

    public int getMenu() {
        int menu;
        System.out.println("1.add 2.delete 3.printList 4.exit");
        System.out.println("choose one");
        menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex13 ex = new Ex13();

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
                case 4:
                    System.out.println("exit");
                    System.exit(0);
                    break;
                default:
                    break;

            }
            System.out.println();
        }

    }

}
