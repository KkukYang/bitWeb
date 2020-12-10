package yangStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
//        System.out.println("aa");
//        String[] strArr = "dd,aaa,CC,cc,b,b".split(",");
        String[] strArr = {"dd", "aaa", "cca", "ccCC", "caxas", "bb", "dd", "aaa"};
        Stream<String> stream = Stream.of(strArr);
//        Stream<String> filteredStream = stream.filter(str->str.contains("a")||str.contains("d"));
//        Stream<String> distinctedStream = stream.distinct();
//        Stream<String> sortedStream = stream.sorted();
//        Stream<String> limitedStream = stream.limit(3);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        int total;
//        total = (int)filteredStream.count();
//        System.out.println(total);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Arrays.stream(strArr).filter(str->str.contains("a")/*||str.contains("d")*/).forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(strArr).distinct().forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(strArr).sorted().forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(strArr).sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(strArr).sorted().limit(5).forEach(System.out::println);
//        System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //String Array -> 가공 후 String Array
//        String[] strArr2 = Arrays.stream(strArr).sorted().toArray(String[]::new);
//        for(String str : strArr2){
//            System.out.print(str + ",");
//        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //String Array -> 가공 후 String List
//        List<String> strList = Arrays.stream(strArr).sorted().collect(Collectors.toCollection(ArrayList::new));
//        List<String> strList = Arrays.stream(strArr).sorted().collect(Collectors.toList()); //같은 결과.
//        System.out.println(strList.toString());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //String Array -> String List

        // List<String> list = Arrays.asList("abc","ab1c","ab2c","a3bc","4","a5bc");

        List<String> arr = Arrays.stream("1,2,3,4,5,6".split(","))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(arr.toString());     //[6, 5, 4, 3, 2, 1]
        List<String> arr2 = Arrays.asList(arr.toString().substring(1, arr.toString().length() - 1));
        System.out.println(arr2.toString());    //[6, 5, 4, 3, 2, 1]

//        //javascript
//        var arr = [6, 5, 4, 3, 2, 1];
//        undefined
//        arr
//        [6, 5, 4, 3, 2, 1]


        System.out.println();
        List<String> arr3 = new ArrayList<>();
        arr3.add("asdf");
        arr3.add("asdf1");
        System.out.println(arr3.contains("asdf"));
        System.out.println(arr3);
    }
}
