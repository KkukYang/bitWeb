package yangStudy;


public class exam {

    public static class MyPerson {
        String name;
        int age;

        public MyPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void write() {
            System.out.println("내이름은 " + this.name + "이고 " + this.age + "세 입니다.");
        }
    }

    public static void main(String[] args) {
        MyPerson p = new MyPerson("캐서린", 23);
        p.write();

        int a = 0;
        char ch = 'a';
        double d = 0.111;
        double r = a + d;
        System.out.println();
    }
}
