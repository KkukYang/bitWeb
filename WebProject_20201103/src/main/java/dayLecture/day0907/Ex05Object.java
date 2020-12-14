package dayLecture.day0907;

public class Ex05Object {

    private String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex05Object ex = new Ex05Object();

        ex.setName("마이클");

        System.out.println("my anme is " + ex.getName());

        Ex05Object ex2 = new Ex05Object();
        ex2.setName("캐서린");
        System.out.println("Name : " + ex2.getName());
    }

}
