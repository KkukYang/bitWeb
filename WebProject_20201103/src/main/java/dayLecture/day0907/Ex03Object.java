package dayLecture.day0907;

class Apple {
    int score = 100;
    final static String MESSAGE = "Have a Nice Day!!!";
}

public class Ex03Object {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//	Apple.MESSAGE = "12";	//not allow
        System.out.println(Apple.MESSAGE);
        Apple ap = new Apple();
        System.out.println(ap.score);

        Apple ap2 = new Apple();
        ap2.score = 232323;
        System.out.println(Apple.MESSAGE);
        System.out.println(ap2.score);
        System.out.println(ap.score);
    }

}
