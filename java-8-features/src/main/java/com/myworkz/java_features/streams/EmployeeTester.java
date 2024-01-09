package com.myworkz.java_features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTester {
    public static void main(String[] args) {
        List<EmployeeDto> empList = Arrays.asList(new EmployeeDto(1,"ullas","developer",40000),
                new EmployeeDto(3,"tejas","Artificial Intelligence",50000),
                new EmployeeDto(4,"sharan","Data Analyst",45000),
                new EmployeeDto(2,"gagan","DevOps",57000),
                new EmployeeDto(6,"pavan","UI/UX",64000),
                new EmployeeDto(5,"pranam","Data Scientist",75000),
                new EmployeeDto(8,"vignesh","Data Analyst",35000),
                new EmployeeDto(6,"tarun","DevOps",52000),
                new EmployeeDto(7,"vatsa","UI/UX",69000));

        empList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("By Name : ");
        empList.stream().sorted(Comparator.comparing(EmployeeDto::getEmpName)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("By Department : ");
        empList.stream().sorted(Comparator.comparing(EmployeeDto::getDepartment)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("By Salary : ");
        empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Min salary : ");
        System.out.println(empList.stream().min(Comparator.comparing(EmployeeDto::getSalary)).get());

        System.out.println("Max salary : ");
        System.out.println(empList.stream().max(Comparator.comparing(EmployeeDto::getSalary)).get());

        System.out.println("Min 2 Salary : ");
        System.out.println(empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).collect(Collectors.toList()).stream().limit(2).collect(Collectors.toList()).get(1));

        System.out.println(empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).limit(2).collect(Collectors.toList()).get(1));
        System.out.println(empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).skip(1).findFirst().get());

        System.out.println("Max salary:");
        System.out.println(empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).findFirst().get());

        System.out.println("2 Max salary:");
        System.out.println(empList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst().get());

        System.out.println(empList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment)));

        /*Group By*/
        Map<String, Long> departmentCountMap = empList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting()));

        departmentCountMap.forEach((department, count) ->
                System.out.println("Department: " + department + ", Count: " + count));

        System.out.println( empList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())));
    }
}
