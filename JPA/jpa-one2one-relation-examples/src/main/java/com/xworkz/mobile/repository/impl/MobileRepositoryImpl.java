package com.xworkz.mobile.repository.impl;

import com.xworkz.mobile.dto.BatteryDto;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class MobileRepositoryImpl implements MobileRepository {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void createMobile(MobileDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public MobileDto fetchMobileById(int id) {
        return em.find(MobileDto.class,id);
    }

    @Override
    public BatteryDto fetchBatteryById(int id) {
        return em.find(BatteryDto.class,id);
    }
}
