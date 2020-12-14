package dayLecture.day0907;

class Melon {
    static String SCHOOLNAME = "강남";
    String name;
    int age;
}

public class Ex04Object {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Melon m1 = new Melon();
        Melon m2 = new Melon();
        m1.name = "강호동";
        m2.name = "이영자";
        System.out.println(m1.name + "\t" + m2.name);

        m1.age = 20;
        m2.age = 30;
        System.out.println(m1.age + "\t" + m2.age);

        m1.SCHOOLNAME = "서초고";
        System.out.println(m1.SCHOOLNAME + "\t" + m2.SCHOOLNAME);
        m2.SCHOOLNAME = "서초고22";
        System.out.println(m1.SCHOOLNAME + "\t" + m2.SCHOOLNAME);
        System.out.println(Melon.SCHOOLNAME);

    }
}
