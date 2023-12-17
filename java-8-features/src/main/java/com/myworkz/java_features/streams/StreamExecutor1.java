package com.myworkz.java_features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExecutor1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(25);
        al.add(30);
        al.add(47);
        al.add(90);
        al.add(56);
        al.add(80);
        System.out.println(al);

       /*To filter if the number is even - filter(boolean)*/
        List<Integer> l = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l);

        /*To add 5 to each number - map(object type)*/
        List<Integer> l1 = al.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println(l1);

        System.out.println();
        /*To add all the elements -reduce(starting num,lambda exp to perform) returns type of num*/
        int n = l1.stream().reduce(0,(i,j)-> i+j);
        System.out.println(n);

        System.out.println();
        /*To count the number which are less than 35 -count()*/
        long failedStuds = al.stream().filter(i -> i<35).count();
        System.out.println(failedStuds);

        /*To sort the list -sorted()*/
        List<Integer> sorted = al.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        /*To sort the list in desc*/
        Comparator<Integer> revComp = (i1,i2) -> (i1<i2)? 1: (i1>i2)?-1:0;
        /*Comparator -sorted(comparator)*/
        List<Integer> reverseSorted = al.stream().sorted(revComp).collect(Collectors.toList());
        System.out.println(reverseSorted);
        /*Comparable */
        List<Integer> reverseSorted2 = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(reverseSorted2);

        Comparator<Integer> comp = (i1,i2) -> (i1<i2)? -1: (i1>i2)?1:0;
        /*Min value */
        Integer min1 = al.stream().min(comp).get();
        System.out.println(min1);

        Integer min = al.stream().min(revComp).get();
        System.out.println(min);

        System.out.println();

        /*Max value */
        Integer max1 = al.stream().max(comp).get();
        System.out.println(max1);

        Integer max = al.stream().max(revComp).get();
        System.out.println(max);

        System.out.println();

        /*To print each element*/
        al.stream().forEach(System.out::println);

        System.out.println();
        /*To square and print*/
        Consumer<Integer> square = i -> System.out.println("Square of " + i +" is " + (i*i));
        al.stream().forEach(square);

        System.out.println();
        /*To convert list to array using stream */
        Integer[] i =  al.stream().toArray(Integer[]::new);
        for (Integer i1 : i){
            System.out.println(i1);
        }

        System.out.println();
        /*Same as above loop*/
        Stream.of(i).forEach(System.out::println);

        System.out.println();
        /*To create Stream Object*/
        Stream<Integer> s = Stream.of(1,11,22,333,4444,55555);
       // s.sorted(revComp).forEach(System.out::println);
        s.forEach(System.out::println);

        System.out.println();
        /*Convert Array to Stream*/
        Integer[] i2 = {1,2,33,44,55,6666,777};
        Stream.of(i2).forEach(System.out::println);

    }
}
