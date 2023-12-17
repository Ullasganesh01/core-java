package com.xworkz.collection_basic;

public class CollectionTester {
    /*
    Java memory is divided into 2 parts mainly heap and stack
    even metaspace is also available - it contains all metadata

    every main method consists a stack
    for every method call a stack frame is being pushed onto the stack
    after the end of that method the frame is popped
    after main method execution stack becomes empty
    frame consists of local variables and method signatures

    objects were created in perm gen in the earlier versions of java

    later on ,

    Heap was divided into new gen and old gen
    Heap also consists of SCP - String constant Pool
    objects are created in new gen

    new gen is divided into 3 areas - keep memory, eden memory and survivor memory (s0, s1)
    Garbage collector minor is called on every area of new gen by JVM when memory gets full
    the GC minor will look for the dereferenced objects 1st and destroy if available else
    it will push the objects into and from Keep mem -> eden -> survivor

     */
}
