package com.myworkz.java_features.default_static_inInterface;

interface StaticMainInInterface {
    static void display(){
        System.out.println("display method");
    }
    static void main(String[] args) {
        System.out.println("Main method in interface");
        display();
    }
}
