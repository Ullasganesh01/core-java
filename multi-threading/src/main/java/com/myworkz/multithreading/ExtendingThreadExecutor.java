package com.myworkz.multithreading;
//By extending Thread class
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
/*Overriding of start method is not recommended as it doesn't create a new thread .
* If overridden don't change the implementation */
    @Override
    public synchronized void start() {
        super.start();
    }
}
public class ExtendingThreadExecutor {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
       myThread.run();//normal method call
//        System.out.println(Thread.currentThread().getThreadGroup());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(myThread.getThreadGroup());
//        System.out.println(myThread.getPriority());
//        myThread.setPriority(9);
//        System.out.println(myThread.getPriority());
//        System.out.println(Thread.currentThread().getPriority());
        myThread.start();// to start a new thread
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
