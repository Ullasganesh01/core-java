package com.xworkz.exception_handling;

public class MultipleInstanceBlocks {
    static {
        System.out.println("static block 1");
    }

    {
        System.out.println("block 1");
    }

    {
        System.out.println("block 2");
    }
    static {
        System.out.println("static block 2");
    }

    MultipleInstanceBlocks(){
        System.out.println("constructor");
    }
    {
        System.out.println("block 3");
    }

    {
        System.out.println("block 4");
    }
    static {
        System.out.println("static block 3");
    }
    public static void main(String[] args) {
        System.out.println("main started");
        MultipleInstanceBlocks m1 = new MultipleInstanceBlocks();
        System.out.println("main ended");
    }
}
