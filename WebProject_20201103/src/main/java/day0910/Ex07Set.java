package day0910;

import java.util.HashSet;
import java.util.Set;

public class Ex07Set {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //순서없이 들어감
        //중복된 데이터는 한번만 들어감

        Set<String> set1 = new HashSet<>();//제너릭 생성타입 생략가능

        //중복된데이타가 없어서 들어갈경우 true
        //중복된 데이터가 있어서 안들어갈 경우 false
        System.out.println(set1.add("apple"));
        System.out.println(set1.add("apple"));//false
        System.out.println(set1.add("orange"));
        System.out.println(set1.add("Orange"));
        System.out.println(set1.add("melon"));

        System.out.println("size : " + set1.size());

        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println(set1);//[orange, apple, melon, Orange]
        set1.clear();
        System.out.println(set1);
    }

}
