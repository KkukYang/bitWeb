package dayLecture.day0909;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class PayOuter {
    private String sawonName;
    private int gibonPay;
    private int timeSu;
    private int familySu;

    class InputInner {
        Scanner sc;

        public InputInner() {
            sc = new Scanner(System.in);
        }

        public void inputData() {
            System.out.println("input sawonName:");
            sawonName = sc.nextLine();
            System.out.println("input gibonPay:");
            gibonPay = Integer.parseInt(sc.nextLine());
            System.out.println("input timeSu:");
            timeSu = Integer.parseInt(sc.nextLine());
            System.out.println("input familySu:");
            familySu = Integer.parseInt(sc.nextLine());
        }
    }

    class SudangInner {
        NumberFormat nf;

        public SudangInner() {
            nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
        }

        public int getTimeSudang() {
            return getTimeSu() * 10000;
        }

        public int getFamilySudang() {
            return (getFamilySu() <= 3) ? 200000 : 300000;
        }

        public int getTax() {
            return (int) (getGibonPay() * 0.03);
        }

        public int getPay() {
            return getGibonPay() + getTimeSu() + getFamilySu() - getTax();
        }

        public void writeData() {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s"
                    , "사원명", "기본급", "초과시간수", "시간수당", "가족수", "가족수당", "세금", "실수령액"));
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(String.format("%s\t%s\t%d\t%s\t%d\t%s\t%s\t%s"
                    , getSawonName()
                    , nf.format(getGibonPay())
                    , getTimeSu()
                    , nf.format(getTimeSudang())
                    , getFamilySu()
                    , nf.format(getFamilySudang())
                    , nf.format(getTax())
                    , nf.format(getPay())));
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public String getSawonName() {
        return sawonName;
    }

    public void setSawonName(String sawonName) {
        this.sawonName = sawonName;
    }

    public int getGibonPay() {
        return gibonPay;
    }

    public void setGibonPay(int gibonPay) {
        this.gibonPay = gibonPay;
    }

    public int getTimeSu() {
        return timeSu;
    }

    public void setTimeSu(int timeSu) {
        this.timeSu = timeSu;
    }

    public int getFamilySu() {
        return familySu;
    }

    public void setFamilySu(int familySu) {
        this.familySu = familySu;
    }


}

public class Ex18 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PayOuter po = new PayOuter();
        PayOuter.InputInner input = po.new InputInner();
        input.inputData();

        PayOuter.SudangInner sudang = po.new SudangInner();
        sudang.writeData();
    }

}
