package com.xworkz.user_mgmt.repository.impl;

import com.xworkz.user_mgmt.dto.PassportDto;
import com.xworkz.user_mgmt.repository.PassportRepository;
import com.xworkz.user_mgmt.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class PassportRepositoryImpl implements PassportRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

    public void addNewUserPassportDetails(PassportDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }
}
