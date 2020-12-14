package dayLecture.day0909;

import java.util.Scanner;

abstract class Board {
    abstract public void process();

}

class InsertBoard extends Board {
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("InsertBoard process");
    }
}

class DeleteBoard extends Board {
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("DeleteBoard process");
    }
}

class ListBoard extends Board {
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("ListBoard process");
    }
}

class UpdateBoard extends Board {
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("UpdateBoard process");
    }
}

public class Ex05 {
    private static Scanner sc;

    public static void process(Board b) {
        b.process();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        sc = new Scanner(System.in);
        boolean isBreak = false;
        while (true) {
            System.out.println("1.InsertBoard 2.DeleteBoard 3.UpdateBoard 4.ListBoard 5.exit");
            System.out.println("choose one.");
            int num = sc.nextInt();
            Board b = null;
            switch (num) {
                case 1:
                    process(new InsertBoard());
                    break;
                case 2:
                    process(new DeleteBoard());
                    break;
                case 3:
                    process(new UpdateBoard());
                    break;
                case 4:
                    process(new ListBoard());
                    break;
                case 5:
                    System.out.println("exit");
                    isBreak = true;
                    break;
                default:
                    break;
            }

            if (isBreak) {
                break;
            }
        }
    }

}
