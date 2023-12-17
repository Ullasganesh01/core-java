package com.myworkz.java_features.predefined_func_interfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  name +
                ", " + marks +
                ' ';
    }
}
public class FunctionExecutor {
    public static void main(String[] args) {
        /*To get square of a number*/
        Function<Integer,Integer> square = i -> i*i;
        System.out.println(square.apply(4));
        System.out.println(square.apply(8));

        System.out.println();
        /*To get the length of the string*/
        Function<String,Integer> length = s -> s.length();
        System.out.println(length.apply("Ullas"));
        System.out.println(length.apply("Sharan"));

        System.out.println();

        /*To get grades based on marks*/
        Function<Student,String> grades = student -> { int marks = student.marks;
            String grade = "";
            if (marks>=80){ grade="A";}
            else if (marks>=60) { grade="B";}
            else if (marks>=50) { grade="C";}
            else if (marks>=35) { grade="D";}
            else { grade="E";}
            return grade;
        };

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Ullas",85));
        al.add(new Student("Tejas",70));
        al.add(new Student("Pavan",55));
        al.add(new Student("Gagan",40));
        al.add(new Student("Sharan",30));
        al.add(new Student("Pranam",60));

        for (Student s : al){
            System.out.println(s.name + " " +  grades.apply(s));
        }

        System.out.println();

        Predicate<Student> marksGt60 = student -> student.marks>60;
        Function<Student,String> firstClass = student -> {
            if (marksGt60.test(student))
                return student.name;
            return "";
        };

        for (Student s : al){
            System.out.println(firstClass.apply(s));
        }

        System.out.println();

        Function<Integer,Integer> doubleValue = integer -> integer*2;
        Function<Integer,Integer> cube = i -> i*i*i;

        System.out.println(doubleValue.andThen(cube).apply(4));
        System.out.println(doubleValue.compose(cube).apply(4));

        System.out.println();

        /*BiFunction used to take 2 arguments as input and return 1 output*/
        BiFunction<String,Integer,Student> createStud = (s, integer) -> new Student(s,integer);
        ArrayList<Student> a = new ArrayList<>();
        a.add(createStud.apply("Ullas",30));
        a.add(createStud.apply("Pavan",70));
        a.add(createStud.apply("Gagan",80));
        a.add(createStud.apply("Tejas",51));
        for (Student student:a){
            System.out.println(student);
        }

    }
}
