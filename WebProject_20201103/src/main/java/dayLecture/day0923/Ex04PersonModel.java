package dayLecture.day0923;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ex04PersonModel {

    PersonDao dao = new PersonDao();
    Scanner sc = new Scanner(System.in);

    public int getMenu() {
        int n;
        System.out.println("\t\t**MENU**");
        System.out.println("1.Add   2.Delete   3.Update   4.Search   5.Print   6.Exit");
        n = Integer.parseInt(sc.nextLine());

        return n;
    }

    public void writeAll() {
        System.out.println("** Print **");

        List<PersonDto> list = dao.getAllPersons();
        System.out.println("번호\t이름\t혈액형\t자바\t스프링\t키\t생일");
        System.out.println("----------------------------------------------------------");
        for (PersonDto dto : list) {
            System.out.println(dto.getNum() + "\t" + dto.getName() + "\t" + dto.getBlood().toUpperCase() + "\t" + dto.getJava() + "\t"
                    + dto.getSpring() + "\t" + dto.getHeight() + "\t" + dto.getBirthday());
        }
        System.out.println("----------------------------------------------------------");
    }

    public void dataAdd() {
        System.out.println("** Add **");
        PersonDto dto = new PersonDto();

        String name, blood;
        int java, spring;
        double height;
        System.out.println("input name:");
        name = sc.nextLine();
        System.out.println("input blood:");
        blood = sc.nextLine();
        System.out.println("input java:");
        java = Integer.parseInt(sc.nextLine());
        System.out.println("input spring:");
        spring = Integer.parseInt(sc.nextLine());
        System.out.println("input height:");
        height = Double.parseDouble(sc.nextLine());
        System.out.println("input yyyy-mm-dd : ");
//	sc.nextLine();
        String birth = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        Date birthday = null;
        try {
            birthday = sdf.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dto.setName(name);
        dto.setBlood(blood);
        dto.setJava(java);
        dto.setSpring(spring);
        dto.setHeight(height);
        dto.setBirthday(birthday);

        dao.personInsert(dto);
    }

    public void dataUpdate() {
        System.out.println("** Update **");

        String name, blood;
        int java, spring;
        int num;

        System.out.println("input number to update. :");
        num = Integer.parseInt(sc.nextLine());
        System.out.println("input name:");
        name = sc.nextLine();
        System.out.println("input blood:");
        blood = sc.nextLine();
        System.out.println("input java:");
        java = Integer.parseInt(sc.nextLine());
        System.out.println("input spring:");
        spring = Integer.parseInt(sc.nextLine());

        PersonDto dto = new PersonDto();
        dto.setNum(num);
        dto.setName(name);
        dto.setBlood(blood);
        dto.setJava(java);
        dto.setSpring(spring);

        int n = dao.personUpdate(dto);

        if (n == 0) {
            System.out.println("not found.");
        } else {
            System.out.println("updated.");
        }

    }

    public void dataDelete() {
        System.out.println("** Delete **");

        String name = "";
        System.out.println("input name to delete. :");
        name = sc.nextLine();

        int n = dao.personDelete(name);
        if (n == 0) {
            System.out.println("not found.");
        } else {
            System.out.println(n + " -> deleted.");
        }
    }

    public void dataSearch() {
        System.out.println("** Search **");

        System.out.println("input blood:");
        String blood = sc.nextLine();

        List<PersonDto> list = dao.searchByBlood(blood);
        System.out.println(String.format("\t** %s형 명단 **", blood.toUpperCase()));
        System.out.println("이름\t자바\t스프링\t키\t생일");
        System.out.println("----------------------------------------------------------");
        for (PersonDto dto : list) {
            System.out.println(dto.getName()
                    + "\t" + dto.getJava()
                    + "\t" + dto.getSpring()
                    + "\t" + dto.getHeight()
                    + "\t" + dto.getBirthday());
        }
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex04PersonModel ex = new Ex04PersonModel();
        while (true) {
            switch (ex.getMenu()) {
                case 1:
                    ex.dataAdd();
                    break;
                case 2:
                    ex.dataDelete();
                    break;
                case 3:
                    ex.dataUpdate();
                    break;
                case 4:
                    ex.dataSearch();
                    break;
                case 5:
                    ex.writeAll();
                    break;
                default:
                    System.out.println("** Exit **");
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }

}
