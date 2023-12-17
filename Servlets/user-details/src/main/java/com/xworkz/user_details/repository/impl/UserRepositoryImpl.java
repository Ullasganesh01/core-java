package com.xworkz.user_details.repository.impl;

import com.xworkz.user_details.dto.UserDto;
import com.xworkz.user_details.repository.UserRepository;
import com.xworkz.user_details.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class UserRepositoryImpl implements UserRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    public void addNewUser(UserDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }
}
