package com.myworkz.multithreading;
/*Remove any one synchronized keyword then there will be no deadlock*/
class A{
    public synchronized void d1(B b){
        System.out.println("Thread1 d1 method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ignored) { }
        System.out.println("Thread trying to call B's last()");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside A's last method");
    }
}

class B{
    public synchronized void d2(A a){
        System.out.println("Thread2 d2 method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ignored) { }
        System.out.println("Thread trying to call A's last()");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Inside B's last method");
    }
}

public class DeadLockExecutor extends Thread{
    A a = new A();
    B b = new B();
    public void m1(){
        this.start();
        a.d1(b);// executed by main
    }

    @Override
    public void run() {
        b.d2(a);//executed by child
    }

    public static void main(String[] args) {
        DeadLockExecutor d = new DeadLockExecutor();
        d.m1();
    }
}
