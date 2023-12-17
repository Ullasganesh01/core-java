package com.myworkz.multithreading;
/*Child thread waits until main completes*/
class MyThread4 extends  Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        }catch (InterruptedException ignored){}
        for (int i=0;i<10;i++){
            System.out.println("Child thread");
        }
    }
}
public class JoinMethodExecutor2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread4.mt = Thread.currentThread();
        MyThread4 t4 = new MyThread4();
        t4.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread");
            Thread.sleep(100);
        }
    }
}
