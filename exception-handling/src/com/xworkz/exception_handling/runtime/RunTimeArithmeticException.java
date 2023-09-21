package com.xworkz.exception_handling.runtime;

public class RunTimeArithmeticException {
    public static void main(String[] args) {
        //System.out.println(10/0); This causes runtime exception
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){    // Handling / by zero for normal termination
            System.out.println(e);
        }
    }
}
