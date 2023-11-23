package com.xworkz.user_mgmt.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
    private static final EntityManagerFactory instance;
    public static EntityManagerFactory getInstance(){
        return instance;
    }
    static {
        instance = Persistence.createEntityManagerFactory("user-details");
    }
}
