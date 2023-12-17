package com.xworkz.bms_app.singleton;

import javax.persistence.Persistence;

public class SingletonExecutorFake {
    public static void main(String[] args) {
        System.out.println(EntityManagerFactorySingleton.getFactory());
        System.out.println(EntityManagerFactorySingleton.getFactory());
        System.out.println(Persistence.createEntityManagerFactory("com.xworkz"));
        System.out.println(Persistence.createEntityManagerFactory("com.xworkz"));

        System.out.println(SingletonEx1.getInstance());
        System.out.println(SingletonEx2.getInstance());
        System.out.println(SingletonEx1.getInstance());
        System.out.println(SingletonEx2.getInstance());

    }
}
