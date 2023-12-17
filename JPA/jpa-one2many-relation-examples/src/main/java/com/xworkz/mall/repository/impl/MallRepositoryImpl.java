package com.xworkz.mall.repository.impl;

import com.xworkz.mall.dto.MallDto;
import com.xworkz.mall.dto.ShopsDto;
import com.xworkz.mall.repository.MallRepository;
import com.xworkz.mall.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class MallRepositoryImpl implements MallRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addMall(MallDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public MallDto getMallInfoById(int id) {
        return em.find(MallDto.class,id);
    }

    @Override
    public ShopsDto getShopsInfoById(int id) {
        return em.find(ShopsDto.class,id);
    }
}
