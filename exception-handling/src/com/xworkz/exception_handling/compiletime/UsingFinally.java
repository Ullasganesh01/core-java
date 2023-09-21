package com.xworkz.exception_handling.compiletime;

import java.util.Scanner;

public class UsingFinally {
    public static void main(String[] args) {
        Scanner s =null;
        try {
            s = new Scanner(System.in);
            System.out.println("enter something : ");
            String sc = s.nextLine();
            System.out.println(sc.length());

            System.out.println(49/0);
        }catch (NullPointerException | ArithmeticException e){  // multiple exceptions handled using "|"
            e.printStackTrace();
        }finally {   // to close the opened resources / costly resources
            System.out.println("inside finally");
            if (s != null){
                s.close();
            }
        }
    }
}
