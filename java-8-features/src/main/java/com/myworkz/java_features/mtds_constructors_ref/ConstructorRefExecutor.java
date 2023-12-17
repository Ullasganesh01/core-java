package com.myworkz.java_features.mtds_constructors_ref;

import java.util.Comparator;

interface GetObject{
    OurObject get(String name);
}
class OurObject{
    String name;
    public OurObject(String name){
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class ConstructorRefExecutor {
    public static void main(String[] args) {
        GetObject g = OurObject::new;

        OurObject o1 = g.get("Ullas");
        OurObject o2 = g.get("Sharan");
        OurObject o3 = g.get("Tejas");
        OurObject o4 = g.get("Gagan");


        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
    }
}
