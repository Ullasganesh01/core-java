package com.myworkz.java_features.mtds_constructors_ref;
interface Add{
    void add(int a,int b);
}
public class MethodRefExecutor {
    public static void add1(int a,int b){
        System.out.println(a+b);
    }

    public void add2(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Add a = (i,j) -> System.out.println(i+j); // using lambda expression
        a.add(2,3);

        Add a1 = MethodRefExecutor::add1; // static method reference
        a1.add(2,3);

        MethodRefExecutor ref = new MethodRefExecutor();
        Add a2 = ref::add2; // instance method reference
        a2.add(2,3);
    }
}
