package com.myworkz.multithreading;
class Display2{
    public void wish(String name){
        /*Other lines code*/
        synchronized (this){ /* --this -  current object reference or synchronized (className.class) -- class level lock or synchronized (objectRef) particular object */
            for (int i=0;i<10;i++){
                System.out.print("Good Morning! ");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException ignored){}
                System.out.println(name);
            }
       }
        /*Other lines code*/
    }
}

class MyThread7 extends Thread{
    Display2 d;
    String name;
    MyThread7(Display2 d,String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class SynchronizedBlockExecutor {
    public static void main(String[] args) {
        Display2 d = new Display2();// 2 threads operating on same display object
        MyThread7 t1 = new MyThread7(d,"Kohli");
        MyThread7 t2 = new MyThread7(d,"Rahul");
        t1.start();
        t2.start();
    }
}
