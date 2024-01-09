package com.myworkz.java_features.mtds_constructors_ref;

import java.util.function.Supplier;

@FunctionalInterface
interface Addition{
    void add(int i,int j);
}

interface Multiplication{
    void multiply(int i,int j);
}

interface Division{
    void divide(int i,int j);
}

class Calculator{
    public Calculator(){
        System.out.println("Created calculator class object");
    }
    public void multiply1(int i,int j){
        System.out.println(i*j);
    }

    public static void multiply2(int i,int j){
        System.out.println(i*j);
    }

    public static void add1(int i,int j){
        System.out.println(i+j);
    }

    public void add2(int i,int j){
        System.out.println(i+j);
    }

    public static void divide(int i,int j){
        System.out.println((float)i/j);
    }
}
public class XworkzMethodReference {


    public static void main(String[] args) {
        Addition addRef = Calculator::add1;
        addRef.add(2,3);

        addRef = Calculator::multiply2;
        addRef.add(2,3);

        Calculator calculator = new Calculator();

        addRef = calculator::add2;
        addRef.add(2,3);

        addRef = calculator::multiply1;
        addRef.add(2,3);

        Multiplication mulRef = Calculator::multiply2;
        mulRef.multiply(2,3);

        mulRef = Calculator::add1;
        mulRef.multiply(2,3);

        mulRef = calculator::multiply1;
        mulRef.multiply(2,3);

        mulRef = calculator::add2;
        mulRef.multiply(2,3);

        Division divRef = Calculator::divide;
        divRef.divide(2,3);

    }
}
