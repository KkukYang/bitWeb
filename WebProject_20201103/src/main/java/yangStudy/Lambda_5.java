package yangStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "ab1c", "ab2c", "a3bc", "4", "a5bc");
////////////////////////////////////////////////////////////////////////
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1); //[abc, ab2c, ab1c, a5bc, a3bc, 4] desc
//             //   return o1.compareTo(o2);//[4, a3bc, a5bc, ab1c, ab2c, abc] asc
//            }
//        });
////////////////////////////////////////////////////////////////////////

        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));//[abc, ab2c, ab1c, a5bc, a3bc, 4]
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));//[4, a3bc, a5bc, ab1c, ab2c, abc]

////////////////////////////////////////////////////////////////////////
        System.out.println(list);
    }
}
