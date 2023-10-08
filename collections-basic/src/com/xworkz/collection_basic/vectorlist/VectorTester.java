package com.xworkz.collection_basic.vectorlist;

import java.util.List;
import java.util.Vector;

public class VectorTester {
    //newCapacity = oldCapacity * 2
    public static void main(String[] args) {
        List<String> fruits2 = new Vector<>();
        fruits2.add("mango");
        fruits2.add("apple");
        fruits2.add("banana");
        fruits2.add("orange");
        fruits2.add(null);
        fruits2.add(null);
        fruits2.add("apple");
        System.out.println(fruits2);
    }
}
