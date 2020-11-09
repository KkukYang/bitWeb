package day0908;

class Apple {
    String msg;
    int num;
    double num2;

    public Apple() {
        this("test", 10, 4.5);
//	super();
//	msg = "test";
//	num = 5;
//	num2 = 2.7;
    }

    public Apple(String msg) {
        super();
        this.msg = msg;
        this.num = 10;
        this.num2 = 4.5;
    }

    public Apple(String msg, int num, double num2) {
        super();
        this.msg = msg;
        this.num = num;
        this.num2 = num2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Apple [msg=" + msg + ", num=" + num + ", num2=" + num2 + "]";
    }
}

public class Ex02ThisConst {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Apple a1 = new Apple();
        Apple a2 = new Apple("happy");
        Apple a3 = new Apple("java", 90, 3.9);

        System.out.println(a1);//자동으로 toString() 호출.
        System.out.println(a1.toString());

        System.out.println(a2);
        System.out.println(a3);

    }

}
