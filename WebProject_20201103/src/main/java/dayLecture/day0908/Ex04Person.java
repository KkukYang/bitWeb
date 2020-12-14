package dayLecture.day0908;

public class Ex04Person {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person[] per = {new Person(), new Person("asdf", 2015, 12, 12.3), new Person("qwer", 1234, 34, 34.5)};

        for (Person p : per) {
            System.out.println(p);
        }
        System.out.println();
        for (Person p : per) {
            System.out.println(p.getName() + "\t" + p.getddi() + "\t" + p.getPungga());
        }
    }

}
