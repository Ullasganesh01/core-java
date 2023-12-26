package com.xworkz.techapp.repository.impl;

import com.xworkz.techapp.dto.TechnologyDto;
import com.xworkz.techapp.repository.TechAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class TechAppRepositoryImpl implements TechAppRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public boolean save(TechnologyDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public List<TechnologyDto> getAllTechnologies() {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createNamedQuery("getAll").getResultList();
    }

    @Override
    public boolean delete(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        TechnologyDto dto = em.find(TechnologyDto.class,id);
        if (dto!=null){
            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public TechnologyDto getTechById(int id) {
        return (TechnologyDto) entityManagerFactory.createEntityManager().createNamedQuery("getTechById").setParameter("id",id).getSingleResult();
    }

    @Override
    public boolean updateTech(TechnologyDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(dto);
        em.getTransaction().commit();
        return true;
    }
}
