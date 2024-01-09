package com.myworkz.java_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExecutor2 {
    public static void main(String[] args) {
        List<String> gang= new ArrayList<>();
        gang.add("ullas");
        gang.add("sharan");
        gang.add("gagan");
        gang.add("tejas");
        gang.add("pavan");
        gang.add("pranam");

        gang.stream().filter(myFilter -> myFilter.endsWith("n")).collect(Collectors.toList()).forEach(System.out::println);
        gang.stream().filter(filter -> filter.equals("gagan")).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(30);
        numbers.add(37);
        numbers.add(50);
        numbers.add(69);

        System.out.println("even :");
        numbers.stream().filter(even->even%2==0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("odd :");
        numbers.stream().filter(odd->odd%2!=0).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("partition");
        System.out.println(numbers.stream().collect(Collectors.partitioningBy(integer -> integer%2==0)));

    }
}
