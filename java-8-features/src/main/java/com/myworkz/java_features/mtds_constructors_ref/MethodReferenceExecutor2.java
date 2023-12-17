package com.myworkz.java_features.mtds_constructors_ref;

public class MethodReferenceExecutor2 {
    public static void m1(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

    public  void m2(){
        for (int i=0;i<10;i++){
            System.out.println("Child-2 Thread");
        }
    }

    public static void main(String[] args) {

        Runnable r = MethodReferenceExecutor2::m1; // implementation of run() is now referenced through static method m1() using className
        Thread thread = new Thread(r);
        thread.start();

        MethodReferenceExecutor2 m = new MethodReferenceExecutor2();
        Runnable r1 = m::m2; // implementation of run() is now referenced through instance method m2() using object
        Thread thread1 = new Thread(r1);
        thread1.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
