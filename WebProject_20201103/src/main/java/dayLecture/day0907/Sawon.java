package dayLecture.day0907;

public class Sawon {
    private String name;
    private int age;
    private String blood;
    private int pay;
    private int sudang;

    public Sawon() {
        super();
        // TODO Auto-generated constructor stub
        this.name = "noname";
        this.age = 10;
        this.blood = "B";
        this.pay = 200;
        this.sudang = 0;
    }

    public Sawon(String name, int age, String blood, int sudang) {
        super();
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.pay = 200;
        this.sudang = 3;
    }

    public Sawon(String name, int age, String blood, int pay, int sudang) {
        super();
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.pay = pay;
        this.sudang = sudang;
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

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getSudang() {
        return sudang;
    }

    public void setSudang(int sudang) {
        this.sudang = sudang;
    }


    public int getTotal() {
        return sudang + pay;
    }


}
