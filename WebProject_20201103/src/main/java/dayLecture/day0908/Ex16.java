package dayLecture.day0908;

import java.util.Scanner;

class Salary {
    private String name;
    private int salary;

    public Salary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getInfomation() {
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);
    }
}

class Sawon extends Salary {
    private String department;

    public Sawon(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getInfomation() {
        // TODO Auto-generated method stub
        super.getInfomation();
        System.out.println("department:" + department);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s\t%d\t%s", this.getName(), this.getSalary(), this.getDepartment());
    }
}

public class Ex16 {

    static Scanner sc;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count;
        Sawon[] sawon;
        sc = new Scanner(System.in);

        System.out.println("input count:");
        count = Integer.parseInt(sc.nextLine());
        sawon = new Sawon[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("%d번쨰 입력\n", i + 1);
            System.out.printf("사원명 ? ");
            String name = sc.nextLine();
            System.out.printf("연봉 ? ");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.printf("부서 ? ");
            String department = sc.nextLine();

            Sawon s = new Sawon(name, salary, department);
            sawon[i] = s;
        }

        System.out.println(String.format("번호\t사원명\t연봉\t부서"));
        System.out.println("----------------------------------");

        for (int i = 0; i < sawon.length; i++) {
            System.out.printf("%d\t%s\n", i + 1, sawon[i].toString());
        }
        System.out.println("----------------------------------");
    }

}
