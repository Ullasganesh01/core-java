package com.myworkz.multithreading;

class MyThread2 extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child thread");
            Thread.yield(); // so main thread can execute first which is having same priority
        }
    }
}
public class YieldMethodExecutor {
    public static void main(String[] args) {
        MyThread2 t2 = new MyThread2();
        t2.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
