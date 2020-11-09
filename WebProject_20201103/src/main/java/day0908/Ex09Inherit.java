package day0908;

class SuperObj {
    public void dispA() {
        System.out.println("dispA()");
    }

    void dispB() {    //아무것도 없으면 public.
        System.out.println("dispB()");
    }

    protected void dispC() {
        System.out.println("dispC()");
    }

    private void dispD() {
        System.out.println("dispD()");
    }
}

class SubObj extends SuperObj {
    public void disp() {
        this.dispA();
        this.dispB();
        this.dispC();
//	this.dispD();

    }
}

public class Ex09Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj s1 = new SubObj();
        s1.disp();
        System.out.println();

        s1.dispA();
        s1.dispB();
        s1.dispC();
    }

}
