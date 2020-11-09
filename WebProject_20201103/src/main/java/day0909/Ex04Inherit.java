package day0909;

abstract class Bujang {
    abstract public void play();

    abstract public void draw();
}

abstract class Sawon1 extends Bujang {
    abstract public void dataadd();
}

class Sawon2 extends Sawon1 {

    @Override
    public void dataadd() {
        // TODO Auto-generated method stub
        System.out.println("dataadd");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play");
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("draw");
    }

}

public class Ex04Inherit {
    public static void process(Sawon1 s) {
        s.play();
        s.draw();
        s.dataadd();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        process(new Sawon2());
    }

}
