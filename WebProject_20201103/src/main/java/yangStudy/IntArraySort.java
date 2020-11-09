package yangStudy;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntArraySort {
    public static void main(String[] args) {
        //asc int array
//        int[] arrInt = {1, 3, 4, 5, 7, 6, 8, 9, 2, 10, 0};
//
//        for(int i:arrInt){
//            System.out.print(i + ",");
//        }
//
//        Arrays.sort(arrInt);
//
//        System.out.println();
//        for(int i:arrInt){
//            System.out.print(i + ",");
//        }


////        asc Integer array
//        Integer[] arrInteger = {1, 3, 4, 5, 7, 6, 8, 9, 2, 10, 0};
//
//        for(int i:arrInteger){
//            System.out.print(i + ",");
//        }
//
//        Arrays.sort(arrInteger);
//
//        System.out.println();
//        for(int i:arrInteger){
//            System.out.print(i + ",");
//        }
//        System.out.println();


//        //desc
//        Integer[] arrInt = {1, 3, 4, 5, 7, 6, 8, 9, 2, 10, 0};
//
//        for(int i:arrInt){
//            System.out.print(i + ",");
//        }
//
//        Arrays.sort(arrInt, Comparator.reverseOrder());
//
//        System.out.println();
//        for(int i:arrInt){
//            System.out.print(i + ",");
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //int array -> Integer Array
//        int[] arrInt = {1, 3, 4, 5, 7, 6, 8, 9, 2, 10, 0};
//        int[] arrInt2 = new int[arrInt.length];
//        // To boxed array
//        Integer[] what = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
//        Integer[] ever = IntStream.of(arrInt).boxed().toArray(Integer[]::new);
//
//        // To boxed list
//        List<Integer> you = Arrays.stream(arrInt).boxed().collect(Collectors.toList());
//        List<Integer> like = IntStream.of(arrInt).boxed().collect(Collectors.toList());
//
//        for (int i : what) {
//            System.out.print(i + ",");
//        }
//
//        System.out.println();
//
//        for (int i : ever) {
//            System.out.print(i + ",");
//        }
//
//        System.out.println();
//
//        for (int i : you) {
//            System.out.print(i + ",");
//        }
//
//        System.out.println();
//
//        for (int i : like) {
//            System.out.print(i + ",");
//        }
//
//        //Integer array -> int array
////int [] ints = you.stream().mapToInt(Integer::intValue).toArray();
////int b[] = Arrays.stream(a).mapToInt(Integer::intValue).toArray();
//
//        // Integer[] what = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
//        arrInt2 = Arrays.stream(what).mapToInt(Integer::intValue).toArray();
//        System.out.println();
//        System.out.println();
//
//        for (int i : arrInt2) {
//            System.out.print(i + ",");
//        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        int val = 1;
//        Integer integer = val;
//        // int -> Integer (Auto boxing) int i2 = integer;
//        // Integer -> int (Auto unboxing)
       /* Boxing
        Primitive 자료형 -> Wrapper 클래스
        Unboxing
        Wrapper 클래스 -> Primitive 자료형
        출처: https://includestdio.tistory.com/1 [includestdio]*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //sort using compare function.
        /*for an list
        Collections.sort(list, Collections.reverseOrder());
        for an array
        Arrays.sort(array, Collections.reverseOrder());*/


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////using stream
        Integer[] arrIntger = {1, 3, 4, 5, 7, 6, 8, 9, 2, 10, 0};
        Stream<Integer> sIntger = Arrays.stream(arrIntger);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }


}
