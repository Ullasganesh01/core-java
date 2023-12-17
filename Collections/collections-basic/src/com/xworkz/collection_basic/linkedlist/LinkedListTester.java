package com.xworkz.collection_basic.linkedlist;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        Collection bikes2 = new LinkedList();
        bikes2.add("mt15");
        bikes2.add("royal enfield");
        bikes2.add("jawa");
        bikes2.add("ducati panigale");
        bikes2.add(15);
        System.out.println(bikes2);

        LinkedList<String> fruits1 = new LinkedList<>(); // Addition and deletion is faster
        fruits1.addLast("guava");
        fruits1.add("mango");
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        fruits1.add(null);
        fruits1.add(null);
        fruits1.addFirst("apple");
        System.out.println(fruits1);
    }
}
