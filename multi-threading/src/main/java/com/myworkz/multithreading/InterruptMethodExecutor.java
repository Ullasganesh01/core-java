package com.myworkz.multithreading;

class MyThread5 extends  Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println("Child thread");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}
public class InterruptMethodExecutor {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 t5 = new MyThread5();
        t5.start();
        Thread.sleep(3000);
        t5.interrupt();//Thread must be in sleeping or waiting to state to call interrupt
        System.out.println("End of main");
    }
}
