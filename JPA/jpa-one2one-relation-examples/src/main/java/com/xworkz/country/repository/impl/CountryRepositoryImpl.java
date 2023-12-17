package com.xworkz.country.repository.impl;

import com.xworkz.country.dto.CapitalCityDto;
import com.xworkz.country.dto.StateDto;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class CountryRepositoryImpl implements CountryRepository {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void saveState(StateDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        System.out.println("Saved!!");
    }

    @Override
    public StateDto getStateDetailsById(int id) {
        return em.find(StateDto.class,id);
    }

    @Override
    public CapitalCityDto getCapitalCityById(int id) {
        return em.find(CapitalCityDto.class,id);
    }
}
