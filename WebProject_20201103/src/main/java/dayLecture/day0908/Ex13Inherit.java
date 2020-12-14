package dayLecture.day0908;

class SuperObj5 {
    String name;

    public SuperObj5(String name) {
        this.name = name;
        System.out.println("Call parent constructor.");
    }

    public void write() {
        System.out.println("name:" + name);
    }
}

class SubObj5 extends SuperObj5 {
    int score;

    public SubObj5(String name, int score) {
        super(name);
        this.score = score;
        System.out.println("Call child constructor.");
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        super.write();
        System.out.println("score:" + score);
    }
}

public class Ex13Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubObj5 sub = new SubObj5("asdf", 123);
        sub.write();
    }

}
