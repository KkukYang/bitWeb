package dayLecture.day0908;

public class Ex05StringBuffer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        sb.append("Happy");
        sb.append(123);
        sb.append("& Nice");
        System.out.println(sb);

        String str = "HappyDay";
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println(sb2);
        sb2.insert(6, "Good"); //insert "Good" at 6 index
        System.out.println(sb2);
        sb2.delete(1, 4); //1~3 index delete
        System.out.println(sb2);

        str = sb2.toString(); //StringBuffer->String.
        System.out.println(str);
    }

}
