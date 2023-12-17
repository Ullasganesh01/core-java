package com.xworkz.multiplex.repository.impl;

import com.xworkz.multiplex.dto.MultiplexDto;
import com.xworkz.multiplex.dto.ScreensDto;
import com.xworkz.multiplex.repository.MultiplexRepository;
import com.xworkz.multiplex.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class MultiplexRepositoryImpl implements MultiplexRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addMultiplex(MultiplexDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public MultiplexDto getMultiplexById(int id) {
        return em.find(MultiplexDto.class,id);
    }

    @Override
    public ScreensDto getScreenById(int id) {
        return em.find(ScreensDto.class,id);
    }
}
