package com.myworkz.java_features.anonymousClass;

interface A{
    void m1();
    void m2();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // anonymous inner class implementation of Runnable Interface and object creation
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };
        // same above code with lambda expression
        Runnable runnable2 = () -> {
            for (int i=0;i<10;i++){
                System.out.println("Child-2 Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

        //While using lambda expressions , we can use only functional interfaces
        //whereas while using anonymous inner-classes it doesn't have to be functional interface
        //the interface can contain more than one method

        A a = new A() {
            @Override
            public void m1() {
                System.out.println("A method");
            }

            @Override
            public void m2() {
                System.out.println("B method");
            }
        };

        a.m1();
        a.m2();

    }
}
