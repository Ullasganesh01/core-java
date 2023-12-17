package com.myworkz.java_features.optional;

import java.util.Optional;

class Department{
    int id;
    String name;
    String company;

    public Department(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
public class OptionalExecutor {
    public static void main(String[] args) {
        Department d1 = new Department(1,"it","Meta");
        Department d2 = new Department(2,"Developers",null);

        Optional<String> oName = Optional.ofNullable(d1.name);
        System.out.println(oName);

        if (oName.isPresent()){
            System.out.println(oName.get());
        }else {
            System.out.println(oName.orElse("no value"));
        }

        System.out.println(oName.map(String::toUpperCase).orElse("map no value"));
        System.out.println(oName.map(String::toUpperCase).orElseGet(()->"else get no value"));

        /*----------------------------------------------------------------------------------*/

        oName = Optional.ofNullable(d2.company);
        System.out.println(oName);

        if (oName.isPresent()){
            System.out.println(oName.get());
        }else {
            System.out.println(oName.orElse("no value"));
        }

        System.out.println(oName.map(String::toUpperCase).orElse("map no value"));
        System.out.println(oName.map(String::toUpperCase).orElseGet(()->"else get no value"));

    }
}
