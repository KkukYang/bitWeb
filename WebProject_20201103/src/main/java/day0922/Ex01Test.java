package day0922;

class SuperObj {
    public SuperObj() {
        // TODO Auto-generated constructor stub
        System.out.println("Call super constructor.");
    }

    public void process() {
        System.out.println("Call super constructor.");
    }
}

class SubObj extends SuperObj {
    public SubObj() {
        // TODO Auto-generated constructor stub
        super();
        System.out.println("process() in SuperObj");
    }

    @Override
    public void process() {
        // TODO Auto-generated method stub
        super.process();
    }

    public void show() {
        System.out.println("It has only subClass.");
    }
}

public class Ex01Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj s1 = new SubObj();
        s1.process();
        s1.show();

        SuperObj s2 = new SubObj();
        s2.process();
//	s2.show();
    }

}
