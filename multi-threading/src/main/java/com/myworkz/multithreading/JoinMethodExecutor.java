package com.myworkz.multithreading;

class MyThread3 extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child thread");
            try {
                Thread.sleep(100);//sleep method
            }catch (InterruptedException ignored){ }
        }
    }
}
public class JoinMethodExecutor {
    public static void main(String[] args) throws InterruptedException{
        MyThread3 t3 = new MyThread3();
        t3.start();
        //t3.join(10);//waits for only some amount of time
        t3.join();// main method waiting for child thread to complete its execution
        for (int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
