package dayLecture.day0907;

public class Ex02Object {

    int x = 10;
    static int y = 20;
    final String MSG1 = "Happy";
    static final String MSG2 = "Nice";

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(Ex02Object.y);
        System.out.println(y);

        Ex02Object ob = new Ex02Object();
        System.out.println(ob.x);

        System.out.println(ob.MSG1);    //객체 통해서만. 접근 가
        System.out.println(Ex02Object.MSG2);
        System.out.println(MSG2);

    }

}
