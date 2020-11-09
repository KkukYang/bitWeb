package yangStudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", this.name, this.age);
    }
}

public class Lambda_4 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("홍길동", 20));
        list.add(new User("아무개", 25));
        list.add(new User("무지개", 21));
        list.add(new User("김린지", 24));
        list.add(new User("호호호", 29));

        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);
    }
}
