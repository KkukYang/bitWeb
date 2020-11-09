package day0910;

import day0908.Person;

import java.util.List;
import java.util.Vector;

public class Ex12List {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Person> list = new Vector<Person>();

        list.add(new Person("Lee", 1989, 167.3, 56.8));
        list.add(new Person("kang", 1970, 189.3, 89.8));
        list.add(new Person("Lee2", 1997, 167.3, 56.8));
        list.add(new Person("Lim", 1989, 167.3, 56.8));

        System.out.println("size:" + list.size());
        System.out.println("output 1");
        for (Person p : list) {
            System.out.println(p.getName() + "\t" + p.getYear() + "\t" + p.getHeight() + "\t" + p.getWeight() + "\t"
                    + p.getPungga());
        }
        System.out.println();

        System.out.println("output 2");
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println(i + 1 + "\t" + p.getName() + "\t" + p.getYear() + "\t" + p.getHeight() + "\t"
                    + p.getWeight() + "\t" + p.getPungga());
        }

    }

}
