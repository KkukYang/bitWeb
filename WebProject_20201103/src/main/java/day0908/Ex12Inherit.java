package day0908;

class SuperObj4 {
    private String title;

    public SuperObj4(String title) {
        System.out.println("Call parent constructor.");
        this.title = title;
    }

    public void write() {
        System.out.println("title:" + title);
    }

}

class SubObj4 extends SuperObj4 {
    private String msg;

    public SubObj4(String title, String msg) {
        super(title);
        System.out.println("Call child constructor.");
        this.msg = msg;
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("msg:" + msg);
        super.write();
    }
}


public class Ex12Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj4 sub = new SubObj4("hello", "study");
        sub.write();
    }

}
