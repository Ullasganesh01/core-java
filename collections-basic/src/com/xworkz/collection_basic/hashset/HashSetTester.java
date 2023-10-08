package com.xworkz.collection_basic.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetTester {
    /*
set doesn't accept default value - null
it will accept only 1 null value
it doesn't accept insertion order
set will have unique values
 */
    /*
    the hashset internally implements hashmap
    when an add method is called it internally calls put method of hashmap
    the add(value) calls put(key,value) and stores value of add() in key of put() and the value of put() is PRESENT
    put() it returns null for the first time when a new object is being stored.
    else the object which is stored in value is returned
    so no duplicates are allowed in set because in hashmap there should be unique or different keys.
    [No duplicate keys are allowed].
     */
    public static void main(String[] args) {
        Collection bikes4 = new HashSet();
        bikes4.add("mt15");
        bikes4.add("royal enfield");
        bikes4.add("jawa");
        bikes4.add("ducati panigale");
        bikes4.add(15);
        System.out.println(bikes4);

        Set<String> vegetables1 = new HashSet<>();
        vegetables1.add("potato");
        vegetables1.add(null);
        vegetables1.add(null); //in hash set  only one null value is considered
        vegetables1.add("carrot");
        vegetables1.add("tomato");
        vegetables1.add("carrot"); //duplicate element so it considers only one
        System.out.println(vegetables1);
    }
}
