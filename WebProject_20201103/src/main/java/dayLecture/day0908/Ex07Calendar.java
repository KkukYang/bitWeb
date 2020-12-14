package dayLecture.day0908;

import java.util.Calendar;

public class Ex07Calendar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //영어 날짜 월/일 년 
        Calendar cal = Calendar.getInstance();
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH) + 1;
        int d = cal.get(Calendar.DATE);

        System.out.println(y + "-" + m + "-" + d);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));// 8 8일 
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 3 화요일 

        int hh = cal.get(Calendar.HOUR);
        int mm = cal.get(Calendar.MINUTE);
        System.out.println(hh + ":" + mm);

    }

}
