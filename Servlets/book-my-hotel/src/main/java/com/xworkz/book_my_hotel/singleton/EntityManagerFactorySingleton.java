package com.xworkz.book_my_hotel.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
    private static final EntityManagerFactory instance;
    public static EntityManagerFactory getInstance(){
        return instance;
    }
    static {
        instance = Persistence.createEntityManagerFactory("feedback");
    }
}
