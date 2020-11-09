package day0908;

class SuperObj2 {
    String name;
    int age;

    public SuperObj2() {
        super();
        System.out.println("Call parent constructor.");
        this.name = "홍길동";
        this.age = 20;
    }

    public void write() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

class SubObj2 extends SuperObj2 {
    String hp;

    public SubObj2() {
        System.out.println("Call child constructor");
        hp = "010-222-3333";
    }
}

public class Ex10Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj2 so2 = new SubObj2();


    }

}
