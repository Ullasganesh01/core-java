package com.myworkz.java_features.predefined_func_interfaces;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExecutor {

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Ullas",85));
        al.add(new Student("Tejas",70));
        al.add(new Student("Pavan",55));
        al.add(new Student("Gagan",40));
        al.add(new Student("Sharan",30));
        al.add(new Student("Pranam",60));

        Function<Student,String> grades = student -> { int marks = student.marks;
            String grade = "";
            if (marks>=80){ grade="A";}
            else if (marks>=60) { grade="B";}
            else if (marks>=50) { grade="C";}
            else if (marks>=35) { grade="D";}
            else { grade="E";}
            return grade;
        };

        Consumer<Student> print = student -> {
            System.out.println(student.name);
            System.out.println(student.marks);
            System.out.println(grades.apply(student));
            System.out.println();
        };

        Predicate<Student> marksGt60 = student -> student.marks>60;

        for (Student s : al){
            if (marksGt60.test(s)){
                print.accept(s);
            }
        }

        System.out.println();

        Consumer<Student> toUpper = student -> System.out.println(student.name.toUpperCase());
        Consumer<Student> encourage = student -> System.out.println(student.name+" is brave!!");
        Consumer<Student> getLength = student -> System.out.println(student.name.length());
        Consumer<Student> combined = toUpper.andThen(encourage);
        Consumer<Student> combined2 = toUpper.andThen(encourage).andThen(getLength);

        toUpper.accept(al.get(1));
        System.out.println();
        encourage.accept(al.get(1));
        System.out.println();
        getLength.accept(al.get(1));
        System.out.println();
        combined.accept(al.get(1));
        System.out.println();
        combined2.accept(al.get(1));

        System.out.println();

        ArrayList<Employee> a = new ArrayList<>();
        a.add(new Employee("Ullas",20000,21));
        a.add(new Employee("Gagan",30000,19));
        a.add(new Employee("Tejas",40000,20));
        a.add(new Employee("Pavan",10000,22));
        a.add(new Employee("Sharan",15000,18));
        a.add(new Employee("Pranam",25000,24));
        for (Employee e:a){
            System.out.println(e);
        }
        System.out.println();

        BiConsumer<Employee,Integer> hike = (employee, integer) -> employee.salary+=integer;
        for (Employee e : a){
            hike.accept(e,1000);
        }

        System.out.println("After hike");
        System.out.println();
        for (Employee e:a){
            System.out.println(e);
        }

    }
}
