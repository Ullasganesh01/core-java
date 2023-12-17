package com.myworkz.java_features.lambdaExp_FuncInterface;

//class MyThread implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<10;i++){
//            System.out.println("Child Thread");
//        }
//    }
//}
//
//public class LambdaInMultiThreading {
//    public static void main(String[] args) {
//        MyThread r = new MyThread();
//        Thread thread = new Thread(r);
//        thread.start();
//        for (int i=0;i<10;i++){
//            System.out.println("Main Thread");
//        }
//    }
//}

/*Instead of the above code using lambda we can perform the same operation */

public class LambdaInMultiThreading {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            }
        };

        Thread thread = new Thread(r);
        thread.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}