package com.xworkz.many2one.airport.repository.impl;

import com.xworkz.many2one.airport.singleton.EntityManagerFactorySingleton;
import com.xworkz.many2one.airport.dto.AirportDto;
import com.xworkz.many2one.airport.dto.TerminalsDto;
import com.xworkz.many2one.airport.repository.AirportRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

    @Override
    public AirportDto getAirportInfoById(int id) {
        Query query = em.createNamedQuery("getAirportInfoByTerminalId").setParameter("id",id);
        TerminalsDto dto = (TerminalsDto) query.getSingleResult();
        return dto.getAirport();
    }
}
