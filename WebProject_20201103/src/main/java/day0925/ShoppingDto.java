package day0925;

/*
* 이름      널?       유형
------- -------- -------------
NUM     NOT NULL NUMBER(5)
SANGPUM          VARCHAR2(30)
PHOTO            VARCHAR2(100)
SU               NUMBER(20)
DAN              NUMBER(20)
COLOR            VARCHAR2(20)
IPGODAY          DATE
* */

import java.util.Date;

public class ShoppingDto {
    private int num;
    private String sangpum;
    private String photo;
    private int su;
    private int dan;
    private String color;
    private Date ipgoday;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSangpum() {
        return sangpum;
    }

    public void setSangpum(String sangpum) {
        this.sangpum = sangpum;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getIpgoday() {
        return ipgoday;
    }

    public void setIpgoday(Date ipgoday) {
        this.ipgoday = ipgoday;
    }
}
