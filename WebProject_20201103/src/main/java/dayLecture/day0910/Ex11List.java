package dayLecture.day0910;

import java.util.ArrayList;
import java.util.List;

public class Ex11List {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] data = {"red", "green", "blue", "yellow", "pink", "green", "red", "gray"};
        List<String> list = new ArrayList<String>();

        for (String d : data) {
            list.add(d);
        }

        System.out.println("size:" + list.size());
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("greed");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

}
