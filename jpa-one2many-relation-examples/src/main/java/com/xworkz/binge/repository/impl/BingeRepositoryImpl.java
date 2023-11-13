package com.xworkz.binge.repository.impl;

import com.xworkz.binge.dto.BingeDto;
import com.xworkz.binge.dto.OttDto;
import com.xworkz.binge.repository.BingeRepository;
import com.xworkz.binge.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class BingeRepositoryImpl implements BingeRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void saveBinge(BingeDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public BingeDto getBingeById(int id) {
        return em.find(BingeDto.class,id);
    }

    @Override
    public OttDto getOttById(int id) {
        return em.find(OttDto.class,id);
    }
}
