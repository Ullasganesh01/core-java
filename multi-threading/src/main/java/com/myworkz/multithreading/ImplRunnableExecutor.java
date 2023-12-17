package com.myworkz.multithreading;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child-2 Thread");
        }
    }
}

public class ImplRunnableExecutor{
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();//runnable object
        Thread t = new Thread(r); // runnable reference is passed

        System.out.println(Thread.currentThread().getName());//getting thread name
        System.out.println("Main priority : " +Thread.currentThread().getPriority());//get priority
        Thread.currentThread().setName("Loki");
        Thread.currentThread().setPriority(6);// setting priority
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main priority : " +Thread.currentThread().getPriority());


        System.out.println("child priority : " + t.getPriority());
        System.out.println(t.getName());
        t.setName("Batman");
        System.out.println(t.getName());
        t.setPriority(1);
        System.out.println("child priority : " + t.getPriority());

        t.start();// calling start using thread object
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2,"Thor");//setting thread name

        System.out.println(t2.getName());
        System.out.println("child-2 priority : " + t2.getPriority());
        System.out.println(t2.getName());
        t2.setName("Superman");
        System.out.println(t2.getName());
        t2.setPriority(10);
        System.out.println("child-2 priority : " + t2.getPriority());

       // t.start();
        t2.start();
    }
}
