package com.xworkz.passport_app.repository.impl;


import com.xworkz.passport_app.dto.PassportDto;
import com.xworkz.passport_app.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import java.util.List;

@Repository
public class PassportRepositoryImpl implements PassportRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public boolean addNewPassportDetails(PassportDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        boolean isFound = false;
        Query query = em.createNamedQuery("getLoginId");
         List<String> userlist = query.getResultList();
         if (!userlist.isEmpty()){
             for(String name:userlist){
                if (name.equals(dto.getLoginId())){
                    isFound = true;
                }
             }
         }
         if (isFound){
            return false;
         }else {
            em.getTransaction().begin();
            em.persist(dto);
            em.getTransaction().commit();
            return true;
        }
    }

    @Override
    public List loginUser(String loginId, String password) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createNamedQuery("getUserByLoginIdAndPassword");
        query.setParameter("loginId",loginId);
        query.setParameter("password",password);
        return query.getResultList();
    }

    @Override
    public List<PassportDto> getAllPassports() {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createNamedQuery("getAllPassports").getResultList();
    }

    @Override
    public boolean deletePassport(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        PassportDto dto = em.find(PassportDto.class,id);
        if(dto!=null){
            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public PassportDto getPassportById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.find(PassportDto.class,id);
    }

    @Override
    public boolean updatePassport(PassportDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(dto);
        em.getTransaction().commit();
        return true;
    }
}
