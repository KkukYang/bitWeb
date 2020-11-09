package day0907;//package day0907;
//
//class Sawon{
//    private int age;
//    private String name;
//    private String blood;
//    
//
//    private int pay;
//    private int sudang;
//    
//    public Sawon() {
//	this.age = 0;
//	this.name = "none";
//	this.blood = "ABC";
//	this.pay = 0;
//	this.sudang = 10000;
//    }
//
//    public Sawon(String name, int age, String blood, int pay, int sudang) {
//	this.age = age;
//	this.name = name;
//	this.blood = blood;
//	this.pay = pay;
//	this.sudang = sudang;
//    }
//    
//    public Sawon(String name, int age, String blood) {
//	this.age = age;
//	this.name = name;
//	this.blood = blood;
//	this.pay = 0;
//	this.sudang = 10000;
//    }
//    
//    
//    
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getPay() {
//        return pay;
//    }
//    public void setPay(int pay) {
//        this.pay = pay;
//    }
//    public int getSudang() {
//        return sudang;
//    }
//    public void setSudang(int sudang) {
//        this.sudang = sudang;
//    }
//    public String getBlood() {
//        return blood;
//    }
//
//    public void setBlood(String blood) {
//        this.blood = blood;
//    }
//    
//    public int getTotal() {
//	return pay + sudang;
//    }
//    
//}
//
//public class Ex15{
//
//    public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Sawon [] arr = new Sawon[4];
//	arr[0] = new Sawon();
//	arr[1] = new Sawon("이선희", 23,"B", 340, 5);
//	arr[2] = new Sawon("강호동", 31,"A");
//	arr[3] = new Sawon("손 혁", 23,"O", 460, 12);
//	
//	System.out.printf("이름\t나이\t혈액형\t급여\t수당\t총금액\n");
//	for(Sawon s:arr) {
//	    System.out.printf("%s\t%d\t%s\t%d\t%d\t%d\n"
//		    , s.getName(),s.getAge(), s.getBlood(), s.getPay(), s.getSudang(), s.getTotal());
//	}
//	
//	System.out.println("값 변경하기");
//	arr[1].setAge(30);
//	arr[2].setName("강부자");
//	arr[3].setPay(410);
//	arr[3].setSudang(8);
//	
//	System.out.println("** 다시 출력하기 **");
//	
//	System.out.printf("이름\t나이\t혈액형\t급여\t수당\t총금액\n");
//	for(Sawon s:arr) {
//	    System.out.printf("%s\t%d\t%s\t%d\t%d\t%d\n"
//		    , s.getName(),s.getAge(), s.getBlood(), s.getPay(), s.getSudang(), s.getTotal());
//	}
//    }
//
//}
