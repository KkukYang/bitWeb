package dayLecture.day0909;

abstract class Fruit2 {
    abstract public void show();
}

class Apple2 extends Fruit2 {
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Apple2 show");
    }
}

class Kiwi2 extends Fruit2 {
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Kiwi2 show");
    }
}

class Orange2 extends Fruit2 {
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Orange2 show");
    }
}


public class Ex02Inherit {

    public static void process(Fruit2 f) {
        f.show();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fruit2 f1 = new Apple2();
        Fruit2 f2 = new Kiwi2();
        Fruit2 f3 = new Orange2();

        f1.show();
        f2.show();
        f3.show();
        System.out.println();

        process(new Apple2());
        process(new Kiwi2());
        process(new Orange2());
    }

}
