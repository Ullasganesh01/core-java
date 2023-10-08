package com.xworkz.collection_basic.linkedhashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTester {
    /*
set doesn't accept default value - null
it will accept only 1 null value
it doesn't accept insertion order
set will have unique values
 */
    public static void main(String[] args) {
        Collection bikes4 = new LinkedHashSet();
        bikes4.add("mt15");
        bikes4.add("royal enfield");
        bikes4.add("jawa");
        bikes4.add("ducati panigale");
        bikes4.add(15);
        System.out.println(bikes4);

        Set<String> vegetables2 = new LinkedHashSet<>();
        vegetables2.add("potato");
        vegetables2.add(null);
        vegetables2.add(null); //in linked hash set  only one null value is considered
        vegetables2.add("carrot");
        vegetables2.add("tomato");
        vegetables2.add("carrot"); //duplicate element so it considers only one
        System.out.println(vegetables2);
    }
}
