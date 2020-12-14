package dayLecture.day0910;

import java.util.Date;

public class Ex01Exception {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date date = null;
        try {
            System.out.println(date.getYear() + 1900);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }

}
