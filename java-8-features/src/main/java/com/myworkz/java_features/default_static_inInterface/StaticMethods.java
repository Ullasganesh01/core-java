package com.myworkz.java_features.default_static_inInterface;

interface XYZ{
    static void display(){
        System.out.println("Static method of interface");
    }
}
public class StaticMethods{
    public static void main(String[] args) {
        XYZ.display();
    }
}
