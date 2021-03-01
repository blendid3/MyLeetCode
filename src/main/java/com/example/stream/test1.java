package com.example.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class test1 {
    static  int  i = 0;
    public static void main(String[] args) {
//        // part1 Consumer, function
//        int[] arr = new int[10];
//        Consumer<Integer> c1 = c -> {c++; };
//        Function<Integer, Integer> f1 = c -> c;
////        Arrays.stream(arr).forEach(f1);
//
//        // part2  print
//        Arrays.stream(arr).sequential().forEach(System.out::println);
//        Stream<Integer> stream1 = Stream.of(-2, -1, 0, 1, 2);
////        List<Integer> l1 = new ArrayList(2,1);
//        List<Integer> vowels = Arrays.asList(1, 2, 3);
//        List<Integer> vowels1 = Arrays.asList(1, 2, 3);
//        System.out.println(vowels.getClass());
//
//        // part3 type conversion
//        Set<Integer> result = vowels.stream()
//                .collect(Collectors.toSet());
////        Map<Integer, Integer> result2 = vowels.stream()
////                .collect(Collectors.toMap(Function::identity, Integer.sum(0, 1)));
//        Stream<Integer> s1 = Stream.of(1, 2, 3);
//        Set<Integer> ss1 = s1.collect(Collectors.toSet());
//        Stream<String> stream = Stream.of("G", "E", "K", "S");
////        stream.collect(toMap(p->p.length(), p->1));
////        String[] arrz = stream.toArray(str1 -> {
////            String[] v1 = new String[0];
////            return  v1 + str1;
////        });
//
//        // part 4 List to int[]
//        int [] arr2 = new int[] {1, 2, 3, 4, 5};
        List lz= Arrays.asList(1,2,3,4,5);
////        lz.sort(new Comparator() {
////            @Override
////            public int compare(Object o1, Object o2) {
////                return o1 > o2;
////            }
////        });
//        int[] arrz = lz.stream().mapToInt(s -> (int)s).toArray();
//        Arrays.stream(arrz).sequential().forEach(System.out::println);

//       // part5, Iterator
        Iterator<Integer> itL1 = lz.iterator();
        while (itL1.hasNext()) {
            System.out.println(itL1.next());
            ;
        }
        // part6 filter, map
        Stream.of(1, 2,3).filter(s -> s % 1 == 0).map( s -> "1").forEach(System.out::println); // map is different than forEach, forEach return void, but map return anything as you want


    }
}
