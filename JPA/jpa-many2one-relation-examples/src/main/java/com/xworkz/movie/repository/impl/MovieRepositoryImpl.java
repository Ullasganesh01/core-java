package com.xworkz.movie.repository.impl;

import com.xworkz.movie.dto.ActorsDto;
import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class MovieRepositoryImpl implements MovieRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addMovie(MovieDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public MovieDto getMovieById(int id) {
        return em.find(MovieDto.class,id);
    }

    @Override
    public ActorsDto getActorById(int id) {
        return em.find(ActorsDto.class,id);
    }
}
