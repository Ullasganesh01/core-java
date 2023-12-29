package com.xworkz.bike_showroom.repository.impl;

import com.xworkz.bike_showroom.dto.BikeDto;
import com.xworkz.bike_showroom.repository.BikeShowroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class BikeShowroomRepositoryImpl implements BikeShowroomRepository {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public boolean addBike(BikeDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        return true;
    }

    public List<BikeDto> getAllBikes() {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createNamedQuery("getAllBikes").getResultList();
    }

    public BikeDto getBikeById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.find(BikeDto.class,id);
    }

    public boolean removeBike(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        BikeDto dto = em.find(BikeDto.class,id);
        em.getTransaction().begin();
        em.remove(dto);
        em.getTransaction().commit();
        return true;
    }

    public boolean modifyBike(BikeDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(dto);
        em.getTransaction().commit();
        return true;
    }
}
