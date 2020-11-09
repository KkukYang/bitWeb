package day0909;

abstract class Parent {
    public Parent() {
        System.out.println("Parent");
    }

    public void write() {
        System.out.println("Parent write");
    }
}

abstract class SubObj1 extends Parent {
    public abstract void precess();

    public SubObj1() {
        System.out.println("SubObj1");
    }

    public void hello() {
        System.out.println("SubObj1 hello");
    }
}

class SubWork1 extends SubObj1 {
    public SubWork1() {
        // TODO Auto-generated constructor stub
        System.out.println("SubWork1");
    }

    @Override
    public void precess() {
        // TODO Auto-generated method stub
        System.out.println("cleaning1");
    }

}

class SubWork2 extends SubObj1 {
    public SubWork2() {
        // TODO Auto-generated constructor stub
        System.out.println("SubWork2");
    }

    @Override
    public void precess() {
        // TODO Auto-generated method stub
        System.out.println("cleaning2");
    }
}

public class Ex03Inherit {

    public static void process(SubObj1 p) {
        p.precess();
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        process(new SubWork1());
        process(new SubWork2());
    }

}
