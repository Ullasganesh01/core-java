package com.xworkz.collection_basic.treeset;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTester {
    /*
set doesn't accept default value - null
it will accept only 1 null value
it doesn't accept insertion order
set will have unique values
 */
    public static void main(String[] args) {
        Collection bikes = new TreeSet();
        bikes.add("mt15");
        bikes.add("royal enfield");
        bikes.add("jawa");
        bikes.add("ducati panigale");
        bikes.add("r15");
        System.out.println(bikes);

        Set<String> vegetables = new TreeSet<>();
        vegetables.add("potato");
        //vegetables.add(null); in tree set it doesnt accept null values
        //vegetables.add(null);
        vegetables.add("carrot");
        vegetables.add("tomato");
        vegetables.add("carrot"); // no duplicate element allowed but considers only one
        System.out.println(vegetables);
    }
}
