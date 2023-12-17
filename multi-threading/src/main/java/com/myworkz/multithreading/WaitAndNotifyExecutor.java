package com.myworkz.multithreading;

class ThreadB extends Thread{
    int total=0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread starts calculation");
            for (int i=1;i<=100;i++){
                total+=i;
            }
            System.out.println("Child thread giving notification");
            this.notify();//notify after update
        }
    }
}
/*Consider as ThreadA*/
public class WaitAndNotifyExecutor {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("Main thread calling wait");
            b.wait();  //waiting for update
            System.out.println("Main thread got notification");
            System.out.println(b.total);
        }
    }
}
