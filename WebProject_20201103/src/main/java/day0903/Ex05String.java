package day0903;

public class Ex05String {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1 = new String("apple");
        String s2 = "Apple";
        String msg = "Have a Nice Day!!";
        String msg2 = "   Happy day     ";

        System.out.println("length = " + msg.length());
        System.out.println("length = " + msg2.length());
        System.out.println("length = " + msg2.trim().length());
        System.out.println(msg.charAt(7));
        System.out.println(msg.indexOf('a'));
        System.out.println(msg.indexOf('a', 4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.concat("Orange"));//add string
        System.out.println(msg.endsWith("Day!!"));
        System.out.println(msg.endsWith("Day!!!"));
        System.out.println(msg.startsWith("Have"));
        System.out.println(msg.startsWith("Haha"));
        System.out.println(msg.replace("a", "*"));
        System.out.println(msg.substring(7));
        System.out.println(msg.substring(7, 10));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals("apple"));

        System.out.println(s1.compareTo("apple"));
        System.out.println(s1.compareTo("Apple"));
        System.out.println(s1.compareTo("Banana"));
        System.out.println(s1.compareTo("application"));
        System.out.println("Orange".compareTo("Purple"));

        String s = "red,green,blue,yellow";
        String[] arr = s.split(",");
        for (String a : arr) {
            System.out.println(a);
        }


    }
}
