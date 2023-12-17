package com.xworkz.movie.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

    private static EntityManagerFactory instance = null;

    public static EntityManagerFactory getInstance(){
        return instance;
    }
    static {
        instance = Persistence.createEntityManagerFactory("movie");
    }
}
