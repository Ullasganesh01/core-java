package com.xworkz.collection_basic.arraylist;

import java.util.*;

public class ArrayListTester {
    /*
ArrayList
default capacity =10
newCapacity = oldCapacity + (oldCapacity >> 1)
ArrayList implements RandomAccess Marker interface which provides faster search
 */
    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "ullas";
        names[1] = "tejas";
        names[2] = "sharan";
        names[3] = "rachana";
        names[4] ="gagan";
       // System.out.println(names);
/*
List can allow duplicates;
list accepts null values;
accepts insertion order;
its ordered collection.
 */
        int[] arr = new int[0];
        System.out.println(arr.length + " length " + arr);

        Collection bikes1 = new ArrayList();
        bikes1.add("jawa");
        bikes1.add(15);
        bikes1.add("royal enfield");
        bikes1.add(true);
        bikes1.add("ducati panigale");
        bikes1.add('r');
        System.out.println(bikes1);

        ArrayList<String> fruits = new ArrayList<>(); // searching is faster
        System.out.println(fruits.size());
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        //fruits.add(null);
        //fruits.add(null);
        fruits.add("apple");
        System.out.println(fruits.size());
        System.out.println(fruits);
        Collections.sort(fruits); // to sort
        System.out.println(fruits);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(3);
        nums.add(10);
        nums.add(8);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

    }
}
