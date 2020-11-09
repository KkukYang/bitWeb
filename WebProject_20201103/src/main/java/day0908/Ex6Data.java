package day0908;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex6Data {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("현재날짜와 시간출력하기");
        Date date = new Date();
        int y = date.getYear() + 1900;
        int m = date.getMonth() + 1;
        int d = date.getDate();

        int hh = date.getHours();
        int mm = date.getMinutes();
        int ss = date.getSeconds();

        System.out.printf("today is %d/%d/%d . \n", m, d, y);
        System.out.printf("%d:%d:%d \n", hh, mm, ss);

        int day = date.getDay();
        System.out.println();//day==0 일요일 / day==6 토요일 

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd EEEE");
        SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");

        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        System.out.println(sdf4.format(date));
        System.out.println(sdf5.format(date));
        System.out.println(sdf6.format(date));
        System.out.println(date);
    }

}
