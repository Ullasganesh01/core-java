package com.xworkz.exception_handling.using_throws;

public class ThrowsClassNotFound {
   /* public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main started");
        m1();
        System.out.println("main ended");
    }
    */
    // Alternative method
   public static void main(String[] args) {
       System.out.println("main started");
       try {
           m1();
       }catch (ClassNotFoundException e){
           //e.printStackTrace();
           System.out.println(e);
       }
       System.out.println("main ended");
   }

    private static void m1() throws ClassNotFoundException{
        System.out.println("m1 started");
        m2();
        System.out.println("m1 ended");
    }

    private static void m2() throws ClassNotFoundException{
        System.out.println("m2 started");
        m3();
        System.out.println("m2 ended");
    }

    private static void m3() throws ClassNotFoundException {
        System.out.println("m3 started");
        Class.forName("com.xworkz.exception_handling.using_throws.ThrowsClassNotFoun");
        System.out.println("m3 ended");
    }
}
