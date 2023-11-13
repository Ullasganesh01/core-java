package com.xworkz.country.repository.impl;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.StatesDto;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class CountryRepositoryImpl implements CountryRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addCountry(CountryDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public CountryDto getCountryById(int id) {
        return em.find(CountryDto.class,id);
    }

    @Override
    public StatesDto getStatesById(int id) {
        return em.find(StatesDto.class,id);
    }
}
