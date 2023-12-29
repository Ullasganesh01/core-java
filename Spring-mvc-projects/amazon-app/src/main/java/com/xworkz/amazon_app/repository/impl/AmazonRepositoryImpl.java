package com.xworkz.amazon_app.repository.impl;

import com.xworkz.amazon_app.dto.ProductDto;
import com.xworkz.amazon_app.repository.AmazonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class AmazonRepositoryImpl implements AmazonRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public boolean addProduct(ProductDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createNamedQuery("getAllProducts").getResultList();
    }

    @Override
    public ProductDto getProductById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.find(ProductDto.class,id);
    }

    @Override
    public boolean removeProduct(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        ProductDto dto = em.find(ProductDto.class,id);
        em.getTransaction().begin();
        em.remove(dto);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean modifyProduct(ProductDto dto) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(dto);
        em.getTransaction().commit();
        return true;
    }
}
