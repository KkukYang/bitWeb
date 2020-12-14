package dayLecture.day0908;

class SuperObj3 {
    public String name;
    public int age;

    public SuperObj3() {
        super();
        System.out.println("Call parent constructor");
    }
}

class SubObj3 extends SuperObj3 {
    String hp;

    SubObj3() {
        System.out.println("Call child constructor");
        name = "child";
        age = 30;
        hp = "010-222-3333";
    }

    public void write() {
        System.out.println("이름:" + name);
        System.out.println("age:" + age);
        System.out.println("phone:" + hp);
    }
}

public class Ex11Inherrit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj3 sub = new SubObj3();
        sub.write();
    }

}
