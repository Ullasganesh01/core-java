package com.myworkz.java_features.lambdaExp_FuncInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int eId;
    String eName;

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return " " +
                 eId +
                ":'" + eName + '\'' +
                ' ';
    }
}
public class LambdaInCollections2 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(123,"Ullas"));
        al.add(new Employee(691,"Tejas"));
        al.add(new Employee(589,"Sharan"));
        al.add(new Employee(321,"Gagan"));
        al.add(new Employee(111,"Pavan"));
        System.out.println(al);

        // in ascending order
        Comparator c1 = (o1,o2) -> {
            Employee e1 =  (Employee)o1;
            Employee e2 = (Employee) o2;
            return e1.eId - e2.eId;
        };

        Collections.sort(al,c1);
        System.out.println(al);

        // in descending order
        Comparator c2 = (o1,o2) -> {
            Employee e1 =  (Employee)o1;
            Employee e2 = (Employee) o2;
            return e2.eId - e1.eId;
        };

        Collections.sort(al,c2);
        System.out.println(al);

        // in alphabetical order
        Comparator c3 = (o1,o2) -> {
            Employee e1 =  (Employee)o1;
            Employee e2 = (Employee) o2;
            return e1.eName.compareTo(e2.eName);
        };

        Collections.sort(al,c3);
        System.out.println(al);

        // in reverse alphabetical order
        Comparator c4 = (o1,o2) -> {
            Employee e1 =  (Employee)o1;
            Employee e2 = (Employee) o2;
            return -(e1.eName.compareTo(e2.eName));
        };

        Collections.sort(al,c4);
        System.out.println(al);

        // or using below shortcut for sorting eId in descending order
        Collections.sort(al,(e1,e2) -> e2.eId- e1.eId);
        System.out.println(al);
    }
}
