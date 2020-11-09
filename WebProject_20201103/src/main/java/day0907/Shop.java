package day0907;

public class Shop {
    private String sang;
    private int su;
    private int dan;
    private int total;


    public int getTotal() {

        return su * dan;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSang() {
        return sang;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }

    public int getSu() {
        return su;
    }

    public void setSu(int su) {
        this.su = su;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }


}
