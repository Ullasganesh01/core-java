package com.myworkz.java_features.lambdaExp_FuncInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MyComparator implements Comparator{
////reverse order
//    @Override
//    public int compare(Object o1, Object o2) {
//        return (Integer) o2 - (Integer) o1;
//    }
//}
//
//public class LambdaInCollections {
//    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(50);
//        al.add(30);
//        al.add(90);
//        al.add(60);
//        System.out.println(al);
//        Collections.sort(al);
//        System.out.println(al);
//        Collections.sort(al,new MyComparator());
//        System.out.println(al);
//    }
//}

/*Instead of the above code */

public class LambdaInCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(55);
        al.add(37);
        al.add(96);
        al.add(60);
        System.out.println(al);
        System.out.println();

        al.forEach( n -> System.out.println(n));
        System.out.println();

        Collections.sort(al);
        System.out.println(al);

        Comparator<Integer> comparator = (o1,o2) -> o2-o1;
        Collections.sort(al,comparator);
        System.out.println(al);

        System.out.println();

        al.stream().forEach(System.out::println); // to print each element separately
        System.out.println();

        List<Integer> l = al.stream().filter(i -> i%2==0).collect(Collectors.toList()); // to collect only even numbers
        System.out.println(l);

    }
}
