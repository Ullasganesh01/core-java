package com.myworkz.multithreading;
/*If non daemon thread completes its execution then daemon threads also will be terminated*/
class MyThread8 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(100);
            }catch (InterruptedException ignored){}
        }
    }
}
public class DaemonThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread is daemon : "+Thread.currentThread().isDaemon());
        MyThread8 t = new MyThread8();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
        Thread.sleep(500);
        System.out.println("End of main thread");
    }
}
