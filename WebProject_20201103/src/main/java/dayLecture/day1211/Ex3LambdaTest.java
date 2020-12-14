package dayLecture.day1211;


import java.util.ArrayList;
import java.util.List;

public class Ex3LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple1");
        list.add("apple2");
        list.add("apple3");
        list.add("apple4");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s-> System.out.println(s));

    }
}
