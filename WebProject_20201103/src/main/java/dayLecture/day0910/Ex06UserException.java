package dayLecture.day0910;

import java.util.Scanner;

class UserException extends Exception {
    public UserException(String msg) {
        super(msg);
    }
}

public class Ex06UserException {
    public static void dataInput() throws UserException {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("input name : ");
        name = sc.nextLine();
        if (name.equals("김태희")) {
            throw new UserException("input correct name");
        }
        System.out.println("input age");
        age = sc.nextInt();
        if (age >= 50) {
            throw new UserException("too old");
        }
    }

    public static void main(String[] args) {
        try {
            dataInput();
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
