package com.xworkz.passport.repository.impl;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.dto.PersonDto;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class PassportRepositoryImpl implements PassportRepository {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void savePerson(PersonDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public PersonDto getPersonById(int id) {
        return em.find(PersonDto.class,id);
    }

    @Override
    public PassportDto getPassportById(int id) {
        return em.find(PassportDto.class,id);
    }
}
