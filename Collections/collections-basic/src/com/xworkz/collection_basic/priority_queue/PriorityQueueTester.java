package com.xworkz.collection_basic.priority_queue;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTester {
    /*
queue doesn't accept null values;
duplicates is accepted
doesn't follow insertion order;
 */
    public static void main(String[] args) {
        Collection bikes3 = new PriorityQueue();
        bikes3.add("mt15");
        bikes3.add("royal enfield");
        bikes3.add("jawa");
        bikes3.add("ducati panigale");
        bikes3.add("mt15");
        System.out.println(bikes3);

        Queue<String> juices = new PriorityQueue<>();
        juices.add("mango juice");
        //juices.add(null); // no null values are allowed
        juices.add("apple juice");
        //juices.add(null);
        juices.add("oreo");
        juices.add("chocolate");
        juices.add("oreo"); // duplicates allowed
        System.out.println(juices);
    }
}
