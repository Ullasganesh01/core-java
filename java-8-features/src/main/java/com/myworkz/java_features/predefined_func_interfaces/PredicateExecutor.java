package com.myworkz.java_features.predefined_func_interfaces;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
class Employee{
    String name;
    int salary;
    int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                name +
                ", " + salary +
                ", " + age ;
    }
}

public class PredicateExecutor {
    public static void main(String[] args) {
        // used for conditional statements
        Predicate<Integer> even = integer -> integer%2==0;
        System.out.println(even.test(20));
        System.out.println(even.test(25));

        System.out.println();

        Predicate<Employee> p1 = employee -> employee.age>20&&employee.salary>20000;
        System.out.println(p1.test(new Employee("Ullas",30000,21)));
        System.out.println(p1.test(new Employee("Tejas",10000,19)));

        System.out.println();

        Predicate<String> p2 = s -> s.length()>5;
        System.out.println(p2.test("Ullas"));
        System.out.println(p2.test("Sharan"));

        System.out.println();

        String[] arr = {"Ullas","Sharan","Pavan","Pranam","Tejas MC","Gagan"};
        for (String s:arr){
            if (p2.test(s)){
                System.out.println(s);
            }
        }

        System.out.println();

        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ullas",20000,21));
        al.add(new Employee("Gagan",30000,19));
        al.add(new Employee("Tejas",40000,20));
        al.add(new Employee("Pavan",10000,22));
        al.add(new Employee("Sharan",15000,18));
        al.add(new Employee("Pranam",25000,24));

        Predicate<Employee> age = employee -> employee.age>20;

        for (Employee e : al){
            if (age.test(e)){
                System.out.println(e.name);
            }
        }

        System.out.println();

        int[] x = {0,5,10,15,20,25,30,35};
        Predicate<Integer> even1 = integer -> integer%2==0;
        Predicate<Integer> gt10 = integer -> integer>15;

        System.out.println("Numbers which are even");
        for (int i : x){
            if (even1.test(i)){
                System.out.println(i);
            }
        }

        System.out.println("Numbers which are not even");
        for (int i : x){
            if (even1.negate().test(i)){
                System.out.println(i);
            }
        }

        System.out.println("Numbers which are greater than 15");
        for (int i : x){
            if (gt10.test(i)){
                System.out.println(i);
            }
        }

        System.out.println("Numbers which are not greater than 15");
        for (int i : x){
            if (gt10.negate().test(i)){
                System.out.println(i);
            }
        }

        System.out.println("Numbers which are even and greater than 15");
        for (int i : x){
            if (even1.and(gt10).test(i)){
                System.out.println(i);
            }
        }

        System.out.println("Numbers which are even or greater than 15");
        for (int i : x){
            if (even1.or(gt10).test(i)){
                System.out.println(i);
            }
        }

        System.out.println();

        /*BiPredicate used to take two input arguments */
        BiPredicate<Integer,Integer> sumEven = (integer, integer2) -> (integer+integer2)%2==0;
        System.out.println(sumEven.test(10,20));
        System.out.println(sumEven.test(15,20));

        System.out.println();

        /*To avoid autoboxing and autoUnboxing*/
        IntPredicate even2 = i -> i%2==0;
        System.out.println("Numbers which are even");
        for (int i : x){
            if (even2.test(i)){
                System.out.println(i);
            }
        }
    }
}
