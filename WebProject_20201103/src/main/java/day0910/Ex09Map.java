package day0910;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09Map {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "asdf");
        map.put("age", "23");
        map.put("blood", "ab");
        map.put("addr", "seoul");
        map.put("name", "asdf2");    //업데이트가 되어버림.

        System.out.println("size:" + map.size());
        System.out.println("name:" + map.get("name"));
        System.out.println("age:" + map.get("age"));
        System.out.println("hp:" + map.get("hp"));
        System.out.println();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }


    }

}
