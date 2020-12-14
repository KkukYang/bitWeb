package dayLecture.day0910;

import java.util.HashSet;

public class Ex08Set {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] str = {"java", "beans", "java", "xml", "xml"};
        HashSet<String> hs1 = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();

        for (String n : str) {
            if (!hs1.add(n)) {
                hs2.add(n);
            }
        }

        System.out.println(hs1);
        System.out.println(hs2);

        System.out.println();
        hs1.removeAll(hs2);

        System.out.println(hs1);
        System.out.println(hs2);
    }

}
