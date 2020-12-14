package dayLecture.day0907;

class Hello {
    Hello() {
        System.out.println("default constructor");
    }

    Hello(String name, int age) {
        System.out.println("name : " + name + ", age : " + age);
    }
}

public class Ex13Constructor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Hello h1 = new Hello();
        Hello h2 = new Hello("Hello", 23);
    }

}
