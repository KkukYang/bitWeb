package dayLecture.day0907;

public class Ex09Callby {

    public static void changeInt(int n) {
        System.out.println(("전달받은 n값 : " + n));
        n = 200;
    }

    public static void changeString(String str) {
        System.out.println("전달받은 s값 : " + str);
        str = "java";
    }

    public static void changeArray(int[] arr) {
        arr[1] = 7;
    }

    public static void changeShop(Shop shop) {
        System.out.println(shop.getSang() + "\t" + shop.getSu() + "\t" + shop.getDan());
        System.out.println("shop 정보변경");
        shop.setSang("딸기");
        shop.setDan(3300);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 100;
        changeInt(n);
        System.out.println("n = " + n);

        String s = "happy";
        changeString(s);
        System.out.println(("s=" + s));

        int[] arr = {3, 5, 1, 2};
        changeArray(arr);
        for (int a : arr) {
            System.out.println(a);
        }

        Shop shop = new Shop();
        shop.setSang("오렌지");
        shop.setSu(2);
        shop.setDan(1500);

        changeShop(shop);
        System.out.println(shop.getSang() + "\t" + shop.getSu() + "\t" + shop.getDan());
    }

}
