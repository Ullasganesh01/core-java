package com.xworkz.one2many.airport.repository.impl;

import com.xworkz.one2many.airport.dto.AirportDto;
import com.xworkz.one2many.airport.dto.TerminalsDto;
import com.xworkz.one2many.airport.repository.AirportRepository;
import com.xworkz.one2many.airport.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class AirportRepositoryImpl implements AirportRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addAirport(AirportDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public AirportDto getAirportById(int id) {
        return em.find(AirportDto.class,id);
    }

    @Override
    public TerminalsDto getTerminalById(int id) {
        return em.find(TerminalsDto.class,id);
    }
}
