package com.xworkz.feedbackform.repository.impl;

import com.xworkz.feedbackform.dto.FeedbackDto;
import com.xworkz.feedbackform.repository.FeedbackRepository;
import com.xworkz.feedbackform.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class FeedbackRepositoryImpl implements FeedbackRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addFeedback(FeedbackDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }
}
