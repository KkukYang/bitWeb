package dayLecture.day0909;

interface InterA {
    String MSG = "Happy";

    public void showMessage();
}

class WorkA implements InterA {

    @Override
    public void showMessage() {
        // TODO Auto-generated method stub
        System.out.println(MSG);
    }

}

class WorkB implements InterA {
    String msg = MSG;

    @Override
    public void showMessage() {
        // TODO Auto-generated method stub
        System.out.println("before:" + msg);
        msg = "Nice";
        System.out.println("after:" + msg);
    }
}


public class Ex06Interface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InterA a = new WorkA();
        a.showMessage();
        a = new WorkB();
        a.showMessage();
    }

}
