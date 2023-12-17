package com.xworkz.one2one.ecom_mgmt.repository.impl;

import com.xworkz.one2one.ecom_mgmt.dto.CartDto;
import com.xworkz.one2one.ecom_mgmt.dto.UserDto;
import com.xworkz.one2one.ecom_mgmt.repository.EcomRepository;
import com.xworkz.one2one.ecom_mgmt.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class EcomRepositoryImpl implements EcomRepository {

    //@Override
    public void addUser(UserDto dto) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public void addCart(CartDto dto) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        System.out.println("Added successfully!!");
    }

    @Override
    public UserDto fetchUserById(int id) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        return em.find(UserDto.class,id);
    }

    @Override
    public CartDto fetchCartById(int id) {
        return EntityManagerFactorySingleton.getInstance().createEntityManager().find(CartDto.class,id);
    }
}
