package com.myworkz.java_features.lambdaExp_FuncInterface;

@FunctionalInterface
interface Lambda{
    void display();
}

@FunctionalInterface
interface CalOperations{
    void calc(int a,int b);
}

interface CalOperations2{
    int calc(int a, int b);
}


public class LambdaExpressions {
    //static Lambda l = () -> System.out.println("I am a lambda expression");
    public static void main(String[] args) {

        Lambda l = () -> System.out.println("I am a lambda expression");
        l.display();
        l.display();
        l = () -> System.out.println("I am second lambda expression");
        l.display();

//        LambdaExpressions.l.display();
/*------------------------------------------------------------------------------*/

        CalOperations cal = (int a,int b) -> System.out.println(a+b);
        cal.calc(10,20);

        cal = (a,b) -> System.out.println(a*b);
        cal.calc(10,20);

        cal = (a,b) -> System.out.println(a/b);
        cal.calc(20,10);

/*-------------------------------------------------------------------------------*/


        CalOperations2 cal1 = (int a,int b) -> a+b;
        System.out.println(cal1.calc(10,20));

        cal1 = (a,b) -> {return a*b;};
        System.out.println(cal1.calc(10,20));

        cal1 = (a,b) -> a/b;
        System.out.println(cal1.calc(20,10));

/*-------------------------------------------------------------------------------*/
    }
}
