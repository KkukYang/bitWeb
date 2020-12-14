package dayLecture.day0909;

interface Color {
    public String getColor();
}

interface Car extends Color {
    public void write();
}

class My1 implements Color {
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return "red";
    }
}

class My2 implements Car {

    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return "purple";
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("My car color is : " + getColor());
    }
}

public class Ex08Interface {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Color a1 = new My1();
        System.out.println("My favorite color is : " + a1.getColor());
        Car a2 = new My2();
        a2.write();

    }
}
