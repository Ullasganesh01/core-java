package com.xworkz.book_my_hotel.repository.impl;

import com.xworkz.book_my_hotel.dto.FeedbackDto;
import com.xworkz.book_my_hotel.dto.ResortBookingDto;
import com.xworkz.book_my_hotel.repository.FeedbackRepository;
import com.xworkz.book_my_hotel.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class FeedbackRepositoryImpl implements FeedbackRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addFeedback(FeedbackDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public void addBookingDetails(ResortBookingDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public List<ResortBookingDto> getAllBookingDetails() {
        Query query = em.createNamedQuery("getAllBookingDetails");
        return query.getResultList();
    }
}
