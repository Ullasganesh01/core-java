package com.myworkz.multithreading;
class Display{
    public synchronized void wish(String name){
        for (int i=0;i<10;i++){
            System.out.print("Good Morning! ");
            try {
                Thread.sleep(100);
            }catch (InterruptedException ignored){}
            System.out.println(name);
        }
    }
}

class MyThread6 extends Thread{
    Display d;
    String name;
    MyThread6(Display d,String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class SynchronizedMethodExecutor {
    public static void main(String[] args) {
        Display d = new Display();// 2 threads operating on same display object
        MyThread6 t1 = new MyThread6(d,"Kohli");
        MyThread6 t2 = new MyThread6(d,"Rahul");
        t1.start();
        t2.start();
        /*Output will be not shuffled after one thread completes the execution then other thread will get the chance*/
    }
}
